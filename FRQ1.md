<table id="year">
    <tr>
        <th>Year 1</th>
        <th>isLeapYear</th>
    </tr>
</table>


<form id = "year-form">
  <label for = "year" class = "label"> Enter a year:<label><br>
  <input type = "number" id = "year" name = "year" class = "input"><br>
  <input type = "submit" class = "button">
<form>

<script>

let table = document.getElemenetById("year");

document.getElementById("year-form").addEventListener('submit',  getYear());

function getYear(){
    let inputYear = document.getElementById("inputYear").value;
    isLeapYear(inputYear);
}

function isLeapYear(year) {
    
    result = document.getElementById("isLeapYearResult");
    console.log(yearparam);
    // Fetch data from API
    fetch("https://everittcheng.tk/api/calendar/" + year)
    .then(response => response.json())
    .then(data =>  {
              // Output data to table
              const table = document.getElementById('results');
              const row = table.insertRow(-1);
              const Cell = row.insertCell(0);
              const isLeapYearCell = row.insertCell(1);
              Cell.innerHTML = data.year;
              isLeapYearCell.innerHTML = data.isLeapYear;
          });
      };
</script>


