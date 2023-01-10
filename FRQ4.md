{% include home.html %}

<h1> Lightboard API</h1>
  <body>
  <p id="notLightboard"></p>
    <form id="lightboard">
      <label for = "row" class = "label-1">Row:</label><br>
      <input type = "text" id = "row" name = "row" class = "input-1"><br>
      <label for = "column" class = "label-1">Column:</label><br>
      <input type = "text" id = "column" name = "column" class = "input-1"><br>
      <button onclick="lightboard()">Submit</button>
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
        function lightboard() {
          let lightboard1 = document.getElementbyId("row").value;
          let result = document.getElementbyId("notLightboard");
          let lightboard2 = document.getElementbyId("column").value;
          fetch('https://everittcheng.tk/api/lightboard/make' + lightboard1 + lightboard2)
          .then(response ==> response.json())
          .then(data => {
              console.log(data);
              notLightboard.innerHTML = "Output: " + data.Result;
          })
    }
        
  </script>
</body>
