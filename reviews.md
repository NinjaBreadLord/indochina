<html>
  <head>
    <script>
      function refreshReviews() {
        fetch("https://everittcheng.tk/api/reviews")
          .then(response => response.json())
          .then(reviews => {
            let reviewsList = document.getElementById("reviews-list");
            reviewsList.innerHTML = "";
            for (let review of reviews) {
              let li = document.createElement("li");
              li.innerHTML =
                review.productId + " - " + review.text + " - " + review.rating;
              reviewsList.appendChild(li);
            }
          });
      }
    </script>
  </head>
  <body onload="refreshReviews()">
    <h1>Reviews</h1>
    <ul id="reviews-list"></ul>
  </body>
</html>
