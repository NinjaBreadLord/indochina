<html>
  <head>
    <title> Calculator</title>
  </head>

<p id="eqResult"></p>

<input id="inputEq" placeholder="Input equation here">
    <button onclick="getEq(getInputEq())">Calculate Equation</button>

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
    function getInputEq(){
        let equation = document.getElementById("inputEq").value;
        console.log(equation);
        return equation;
    }

    function getEq(eq) {
        eqResult = document.getElementById("eqResult");
        fetch('http://everittcheng.tk/api/calculator/' + eq)
        .then(response => response.json())
        .then(data => { 
            console.log(data);
            eqResult.innerHTML = "The answer is: " + data.Result;
        })
    }
</script>

</html>