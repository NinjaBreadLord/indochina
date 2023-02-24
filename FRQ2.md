 {% include home.html %}
 
  <form method="POST" id="createuser">
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
    <input value="Submit" type="submit" class="button"/>
  <form>


  <table id = "personlist">
    <thead>
      <tr>
        <th>id</th>
        <th>email</th>
        <th>password</th>
        <th>name</th>
        <th>height</th>
        <th>weight</th>
      </tr>
    </thead>
    <tbody></tbody>
  </table>

<script>

      function inputper(event) {
        event.preventDefault();

        const data = new FormData(event.target);

        const urldata = new URLSearchParams(data).toString();
    
        fetch("https://everittcheng.tk/api/login/post/?" + urldata, {
          method: "POST",
          mode: "no-cors",
          headers: {
            "Content-Type": "application/json"
          }
        })
        
      }

      const make = document.getElementById("createuser");
      make.addEventListener("submit", inputper);


  const userz = document.getElementById("personlist");


  const url = "http://everittcheng.tk/api/login/";

  const options = {
      method: 'GET', 
      mode: 'cors', 
      cache: 'default', 
      credentials: 'omit', 
      headers: {
      'Content-Type': 'application/json'
      },
  };


  function showList() {
    fetch(url, options)
      .then(response => {
        if (response.status !== 200) {
            const errorMsg = 'Database response error: ' + response.status;
            console.log(errorMsg);
            const tr = document.createElement("tr");
            const td = document.createElement("td");
            td.innerHTML = errorMsg;
            tr.appendChild(td);
            userz.appendChild(tr);
            return;
        }
        response.json().then(data => {
            for (const row of data) {

              const tr = document.createElement("tr");

              const id = document.createElement("td");
              const email = document.createElement("td");
              const password = document.createElement("td");
              const name = document.createElement("td");
              const height = document.createElement("td");
              const weight = document.createElement("td");

              id.innerHTML = row.id;
              email.innerHTML = row.email;
              password.innerHTML = row.password;
              name.innerHTML = row.name;
              height.innerHTML = row.height;
              weight.innerHTML = row.weight;




              tr.appendChild(id);
              tr.appendChild(email);
              tr.appendChild(password);
              tr.appendChild(name)
              tr.appendChild(height);
              tr.appendChild(weight);


              userz.appendChild(tr);
              
            }
        })
    })
    
  }

  showList();
</script>