<html>
  <head>
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