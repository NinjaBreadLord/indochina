<html>
  <head>
    <title>Search Bar</title>
  </head>
  <body>
    <h1>Search</h1>
    <input type="text" id="search-input">
    <button type="button" id="search-button">Search</button>
    <ul id="results">
      <!-- Results will be inserted here -->
    </ul>
    <script>
      const searchButton = document.getElementById("search-button");
      const input = document.getElementById("input");
      const resultsList = document.getElementById("results");
      searchButton.addEventListener("click", () => {
        while (resultsList.firstChild) {
          resultsList.removeChild(resultsList.firstChild);
        }
        const search = searchInput.value;
        const data = [
          { name: "Food", type: "South Asian" },
          { name: "Food2", type: "East/Southeast Asia" },
          { name: "Food3", type: "Europe" },
          { name: "Food4", type: "Oceania" },
          { name: "Food5", type: "Middle East, North Africa, Central Asia" },
          { name: "Food6", type: "Sub-Saharan Africa" },
          { name: "Food7", type: "Americas" },
        ];
        for (const item of data) {
          if (item.name.toLowerCase().includes(search.toLowerCase())) {
            const list = document.createElement("list");
            list.innerHTML = `${item.name} (${item.type})`;
            resultsList.appendChild(list);
          }
        }
      });
    </script>
  </body>
</html>
