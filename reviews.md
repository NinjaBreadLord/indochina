<html>
  <head>
    <script>
      function addReview() {
        const reviewText = document.getElementById('review-text').value;
        const reviewRecipe = document.getElementById('review-recipe').value;
        const reviewAuthor = document.getElementById('review-author').value;
        fetch('http://everittcheng.tk/reviews', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({
            text: reviewText,
            recipe: reviewRecipe,
            author: reviewAuthor
          })
        })
        .then(response => response.json())
        .then(data => {
          console.log(data);
        })
        .catch(error => {
          console.error(error);
        });
      }
    </script>
  </head>
  <body>
    <h1>Add a Review</h1>
    <p>
      <textarea id="review-text"></textarea>
    </p>
    <p>
      Recipe: <input type="text" id="review-recipe">
    </p>
    <p>
      Author: <input type="text" id="review-author">
    </p>
    <button onclick="addReview()">Submit Review</button>
  </body>
</html>
