<html>
  <head>
    <title>Review Page</title>
  </head>
  <body>
    <img src="images/review.png">
    <h1>Product Review</h1>

    <form id="review-form">
      <div>
        <label for="name">Name:</label>
        <input type="text" id="name" required>
      </div>
      <div>
        <label for="review">Review:</label>
        <textarea id="review" required></textarea>
      </div>
      <div>
        <label for="rating">Rating:</label>
        <select id="rating" required>
          <option value="">Choose a rating</option>
          <option value="1">1 star</option>
          <option value="2">2 stars</option>
          <option value="3">3 stars</option>
          <option value="4">4 stars</option>
          <option value="5">5 stars</option>
        </select>
      </div>
      <button type="submit">Submit Review</button>
    </form>

    <h2>Reviews</h2>
    <ul id="reviews-list">
      <!-- Reviews will be inserted here -->
    </ul>

    <script>
      const form = document.getElementById("review-form");
      const reviewsList = document.getElementById("reviews-list");

      form.addEventListener("submit", (event) => {
        event.preventDefault();

        const name = document.getElementById("name").value;
        const review = document.getElementById("review").value;
        const rating = document.getElementById("rating").value;

        const li = document.createElement("li");
        li.innerHTML = `${name} gave a rating of ${rating} stars: "${review}"`;
        reviewsList.appendChild(li);

        form.reset();
      });
    </script>
  </body>
</html>

