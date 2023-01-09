<head>FRQ2</head>
<form id = "form1">
    <label for="fname">Full Name:</label><br>
    <input type="text" id="fname" name="fname"><br>
    <label for="email">Email:</label><br>
    <input type="text" id="email" name="email"><br>
    <label for="passw">Password:</label><br>
    <input type="text" id="passw" name="passw">
    <label for="dob">Date of Birth:</label><br>
    <input type="text" id="dob" name="dob"><br>
    <label for="height">height:</label><br>
    <input type="text" id="height" name="height">
    <label for="weight">weight:</label><br>
    <input type="text" id="weight" name="weight">
    <input type = "submit" class = "button1">
</form>

<table id = "table1">
        <tr>
            <th>Full Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Date of Birth</th>
            <th>Height</th>
            <th>Weight</th>
        </tr>
</table>

<script>
    const URL = "";
    function add() {
        fetch(${URL})
        const fname = document.getElementById('fname').value;
        const email = document.getElementById('email').value;
        const passw = document.getElementById('passw').value;
        const dob = document.getElementById('dob').value;
        const height = document.getElementById('height').value;
        const weight = document.getElementById('weight').value;
    }
</script>
