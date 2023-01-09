<html>
  <head>
    <title> Calculator for dummies </title>
  </head>
  <body>
    <form>
      <label for = "number" class = "label"> Enter a nu:<label><br>
      <input type = "text" id = "" name = "number" class = "input"><br>
      <input type = "submit" class = "button">
    </form>
    <style>
      .row {
          align-items: center;
          display: flex;
      }
      .column {
          flex: 33.33%;
          padding: 5px;
      }
      </style>  
  <script>
    // Deployed API URL
        const API_URL = ;
        document.getElementById('calendar-form-1').addEventListener('submit', (event) => {
            event.preventDefault();
            var year1 = document.getElementById('year-1').value;
            // Combine API URL with expression.
            fetch(${API_URL}/isLeapYear/${year1})
            .then(response => response.json())
            .then(data => {
                // Output data to table
                const table = document.getElementById('results');
                const row = table.insertRow(-1);
                const Cell = row.insertCell(0);
                const isLeapYearCell = row.insertCell(1);
                Cell.innerHTML = data.year;
                isLeapYearCell.innerHTML = data.isLeapYear;
            });
        });
  </script>
  </body>
</html>