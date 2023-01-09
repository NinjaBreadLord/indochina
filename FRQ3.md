<html>
  <head>
    <title> Calculator for dummies </title>
  </head>
  <body>
    <form id = calculator-form>
      <label for = "expression" class = "label"> Enter numbers:<label><br>
      <input type = "text" id = "expression" name = "expression" class = "input"><br>
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
        document.getElementById('calculator-form').addEventListener('submit', (event) => {
            event.preventDefault();
            var calculatorExpression = document.getElementById('expression').value; //imputing variable set above as a variable
            // Combine API URL with expression.
            fetch(${API_URL}/${calculatorExpression}) //deployed API + variable created
            .then(response => response.json())
            .then(data => {
                // Output data to table
                const table = document.getElementById('results');
                const row = table.insertRow(-1);
                const Cell = row.insertCell(0);
                Cell.innerHTML = data.Result;
            });
        });
  </script>
  </body>
</html>