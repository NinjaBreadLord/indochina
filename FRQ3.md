<html>
  <head>
    <title> Calculator</title>
  </head>

<ul>
  <li> Remainder - R </li>
  <li> GCD - GCD </li>
  <li> Square Root - sqrt </li>
</ul>

<p id="equationResult"></p>

<input id="inputEq" placeholder="Input equation here">
    <button onclick="getInputEq()">Calculate Equation</button>

<script>
    function getEq(eq) {
        let equation = document.getElementById("inputEq").value;
        equationResult = document.getElementById("equationResult");
        fetch('https://everittcheng.tk/api/calculator/' + equation)
        .then(response => response.json())
        .then(data => { 
            console.log(data);
            equationResult.innerHTML = "Answer: " + data.Result;
        })
    }
</script>

</html>