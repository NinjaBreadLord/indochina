# FRQ 2

<head>
    <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">
</head>

<form id="form">
  Email: <input type="text" id="email"><br>
  Password: <input type="text" id="password"><br>
  Name: <input type="text" id="name"><br>
  Date of Birth: <input type="text" id="dob"><br>
  Height: <input type="text" id="height"><br>
  Weight: <input type="text" id="weight"><br>

  <input type="button" value="Submit" onclick="submitPerson()">
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



<script>
// Function to submit a person to the backend
function submitPerson() {
  // Get the values from the form
  const email = document.getElementById('email').value;
  const password = document.getElementById('password').value;
  const name = document.getElementById('name').value;
  const dob = document.getElementById('dob').value;
  const height = document.getElementById('height').value;
  const weight = document.getElementById('weight').value;

  // Make a POST request to the backend
  fetch('http://everittcheng.tk/api/person/post', {
    method: 'POST',
    body: 'email=${email}&password=${password}&name=${name}&dob=${dob}&height=${height}&weight=${weight}',
  }).then(response => {
    if (response.ok) {
      getPeople();
    }

        // If the request was successful, this gets the list of people from the table

  });
}

// Function to get the list of people and update the table
function getPeople() {
  // Make a GET request to the backend
  fetch('http://everittcheng.tk/api/person/').then(response => {
    if (response.ok) {
      response.json().then(people => {
        const table = document.getElementById('table');
        while (table.rows.length > 1) {
          table.deleteRow(-1);
        }

        // Add a row for each person
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

// Initially get the list of people and update the table
getPeople();

