<html>
  <head>
    <title> Calculator</title>
  </head>

<a> Division - 除 </a>
<a> Remainder - R </a>
<a> GCD - GCD </a>
<a> Square Root - sqrt </a>

<p id="eqResult"></p>

<input id="inputEq" placeholder="Input equation here">
    <button onclick="getInputEq()">Calculate Equation</button>

<script>
    function getEq(eq) {
        let eq = document.getElementById("inputEq").value;

        eqResult = document.getElementById("eqResult");
        fetch('https://everittcheng.tk/api/calculator/' + eq)
        .then(response => response.json())
        .then(data => { 
            console.log(data);
            eqResult.innerHTML = "Answer: " + data.Result;
        })
    }
</script>

</html>