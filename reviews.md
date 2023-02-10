<html>
  <head>
    <style>
      body {
          font-family: sans-serif;
          padding: 20px;
          background-color: lightblue;
      }

      h1 {
          text-align: center;
          margin-bottom: 40px;
      }

      form {
          display: flex;
          flex-direction: column;
          align-items: center;
          margin-bottom: 40px;
      }

      label {
          font-weight: bold;
          margin-bottom: 10px;
      }

      input,
      textarea,
      select {
          padding: 10px;
          font-size: 16px;
          margin-bottom: 20px;
          width: 500px;
      }

      button {
          padding: 10px 20px;
          background-color: darkblue;
          color: white;
          border: none;
          border-radius: 5px;
          cursor: pointer;
      }

      .center {
        display: block;
        margin-left: auto;
        margin-right: auto;
        width: 45%;
      }

      h2 {
          text-align: center;
          margin-bottom: 20px;
      }

      li {
          list-style: none;
          margin-bottom: 20px;
          font-size: 18px;
      }
  </style>
    <title>Review Page</title>
        <script>
          function review(){
            const form = document.getElementById('review-form');
            const nameInput = document.getElementById('name');
            const reviewInput = document.getElementById('review');
            const reviewsContainer = document.getElementById('reviews');
            const recipeInput = document.getElementById('recipe');
            form.addEventListener('submit', (event) => {
              event.preventDefault();
              const name = nameInput.value;
              const review = reviewInput.value;
              const recipe = recipeInput.value;
              const data = { name, recipe, review };
              fetch('https://everittcheng.tk/api/reviews', {
                method: 'POST',
                headers: {
                  'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
              })
                .then(response => response.json())
                .then(data => {
                  // Add the new review to the page
                  const reviewElement = document.createElement('p');
                  reviewElement.innerText = `${data.name}: ${data.review}`;
                  reviewsContainer.appendChild(reviewElement);
                })
                .catch(error => {
                  console.error('Error submitting review', error);
                });
            });
          }
    </script>
  </head>
  <body>
    <h1>Reviews</h1>
    <form id="review-form">
      <input type="text" id="name" placeholder="Name">
      <input type="text" id="recipe" placeholder="Recipe">
      <input type="text" id="review" placeholder="Review">
      <button type="submit" onclick="review()">Submit Review</button>
    </form>
    <div id="reviews">
    </div>
  </body>
</html>