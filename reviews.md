<html>
  <head>
  <style>
      body {
        font-family: Arial, sans-serif;
      }
      h1 {
        text-align: center;
        margin-bottom: 1rem;
      }
      form {
        display: flex;
        flex-direction: column;
        align-items: center;
        margin-bottom: 1rem;
      }
      label {
        font-weight: bold;
        margin-bottom: 0.5rem;
      }
      input[type="text"],
      textarea {
        padding: 0.5rem;
        font-size: 1rem;
        margin-bottom: 1rem;
        border: 1px solid gray;
        border-radius: 5px;
      }
      button[type="submit"] {
        padding: 0.5rem 1rem;
        background-color: lightblue;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
      }
      #review-list {
        list-style: none;
        padding: 0;
        width: 80%;
        margin: 0 auto;
      }
      #review-list li {
        border-bottom: 1px solid gray;
        padding: 0.5rem 0;
      }
    </style>
    <title>Product Review Page</title>
  </head>
  <body>
    <h1>Product Review</h1>
    <form id="review-form">
      <label for="name">Chef:</label>
      <input type="text" id="name" name="name" required>
      <br><label for="recipe">Recipe:</label>
      <input type="text" id="recipe" name="recipe" required>
      <br>
      <label for="review">Review:</label>
      <textarea id="review" name="review" required></textarea>
      <br>
      <button type="submit">Submit Review</button>
    </form>
    <h2>Reviews</h2>
    <ul id="review-list">
    </ul>
  </body>
  <script>
    const reviewForm = document.querySelector('#review-form');
    const reviewList = document.querySelector('#review-list');
    reviewForm.addEventListener('submit', async (event) => {
      event.preventDefault();
      const name = document.querySelector('#name').value;
      const review = document.querySelector('#review').value;
      const recipe = document.querySelector('#recipe').value;
      const response = await fetch('https://everittcheng.tk/api/reviews', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          name,
          recipe,
          review
        })
      });
      if (response.ok) {
        const review = await response.json();
        addReview(review);
      }
    });
    async function getReviews() {
      const response = await fetch('https://everittcheng.tk/api/reviews');
      const reviews = await response.json();
      reviews.forEach(addReview);
    }
    function addReview(review) {
      const li = document.createElement('li');
      li.innerHTML = `${review.name}: ${review.recipe}: ${review.review}`;
      reviewList.appendChild(li);
    }
    getReviews();

  </script>
</html>