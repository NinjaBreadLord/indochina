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

    button[type="submit"] {
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
