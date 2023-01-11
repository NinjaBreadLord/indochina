<table></table>

<script>

let table = document.getElemenetById("year");

function getYear(){
    let inputYear = document.getElementById("inputYear").value;
    return inputYear;
}

function isLeapYear(year) {
    
    result = document.getElementById("isLeapYearResult");
    console.log(year);
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


