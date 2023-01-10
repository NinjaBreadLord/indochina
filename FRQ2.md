


<form id="form">
    <label for = "email" class = "label-1">Email:</label><br>
    <input type = "text" id = "email" name = "email" class = "input-1"><br>
    <label for = "password" class = "label-1">Password:</label><br>
    <input type = "password" id = "password" name = "password" class = "input-1"><br>
    <label for = "name" class = "label-1">Name:</label><br>
    <input type = "text" id = "name" name = "name" class = "input-1"><br>
    <label for = "dob" class = "label-1">Date of Birth:</label><br>
    <input type = "text" id = "dob" name = "dob" class = "input-1"><br>
    <label for = "height" class = "label-1">Height:</label><br>
    <input type = "text" id = "height" name = "height" class = "input-1"><br>
    <label for = "weight" class = "label-1">Weight:</label><br>
    <input type = "text" id = "weight" name = "weight" class = "input-1"><br>
    <input type="button" value="Submit" onclick="submit()">
</form> 

<table id="table">
  <tr>
    <th>ID</th>
    <th>Email</th>
    <th>Password</th>
    <th>Name</th>
    <th>Date of Birth</th>
    <th>Height</th>
    <th>Weight</th>
  </tr>
</table>


<p id="id"></p>

<label for = "getA" class = "label-1">Get Age:</label><br>
<input type = "text" id = "getA" name = "getA" class = "input-1"><br>
<button onclick="getAge()">Get Age</button>

<script>

function submit() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const name = document.getElementById('name').value;
    const dob = document.getElementById('dob').value;
    const height = document.getElementById('height').value;
    const weight = document.getElementById('weight').value;
    fetch('http://everittcheng.tk/api/person/post', {
    method: 'POST',
    body: 'email=${email}&password=${password}&name=${name}&dob=${dob}&height=${height}&weight=${weight}',
  }).then(response => {
    if (response.ok) {
      show();
    }
  });


  
}

function show() {
  fetch('http://everittcheng.tk/api/person/').then(response => {
    if (response.ok) {
      response.json().then(people => {
        const table = document.getElementById('table');
        while (table.rows.length > 1) {
          table.deleteRow(-1);
        }

        for (const person of people) {
          const row = table.insertRow(-1);
          row.insertCell(-1).innerHTML = person.id;
          row.insertCell(-1).innerHTML = person.email;
          row.insertCell(-1).innerHTML = person.password;
          row.insertCell(-1).innerHTML = person.name;
          row.insertCell(-1).innerHTML = person.dob;
          row.insertCell(-1).innerHTML = person.height;
          row.insertCell(-1).innerHTML = person.weight;
        }
      });
    }
  });
}


show();


</script>

