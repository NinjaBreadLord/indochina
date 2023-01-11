{% include home.html %}
<html>
  <head>
    <title> Put in da Date Birth Kiddo </title>
  </head>
  <body>
    <form>
      <label for = "year" class = "label"> Enter a year:<label><br>
      <input type = "number" id = "year" name = "year" class = "input"><br>
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
        const API_URL = 'https://everittcheng.tk/api/calendar/';
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