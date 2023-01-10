<title> Lightboard API </title>
  <body>
    <form method="POST" id="createuser">
      <label for = "row" class = "label-1">Email:</label><br>
      <input type = "text" id = "row" name = "row" class = "input-1"><br>
      <label for = "column" class = "label-1">Password:</label><br>
      <input type = "text" id = "column" name = "column" class = "input-1"><br>
      <input value="Submit" type="submit" class="button"/>
  <form>
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
        const API_URL = 'https://everittcheng.tk/api/lightboard/make/5/2';
        const tableContainer = document.getElementById("table-container");
        const refreshButton = document.getElementById('refresh-button');
        function refreshTable() {
          fetch(API_URL)
            .then(response => response.json())
            .then(data => {
                while (tableContainer.firstChild) {
                tableContainer.removeChild(tableContainer.firstChild);
                }
                const table = document.createElement('table');
                table.style.width = '50%';
                table.style.margin = '0 auto';
        let currentRow;
        for (const { row, column, light } of data) {
        if (row !== currentRow) {
            currentRow = row;
            const tr = document.createElement('tr');
            table.appendChild(tr);
        }
        const td = document.createElement('td');
        td.style.backgroundColor = `rgb(${light.red}, ${light.green}, ${light.blue})`;
        const brightness = (light.red * 299 + light.green * 587 + light.blue * 114) / 1000;
        if (brightness < 128) {
          td.style.color = 'white';
        } else {
          td.style.color = 'black';
        }
        td.innerText = `#${light.red.toString(16).padStart(2, '0')}${light.green.toString(16).padStart(2, '0')}${light.blue.toString(16).padStart(2, '0')}`;
        td.style.textAlign = 'center';
        td.style.verticalAlign = 'middle';
        td.style.fontFamily = 'monospace';
        table.lastElementChild.appendChild(td);
      }
    tableContainer.appendChild(table);
    });
}
refreshButton.addEventListener('click', refreshTable);
        
  </script>
  </body>
