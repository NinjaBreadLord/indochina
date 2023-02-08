 {% include home.html %}
 
 <h1 style = "text-align: center">Login</h1>

  <form action="javascript:showList()">
    <label for = "email" class = "label-1">Email:</label><br>
    <input type = "text" id = "email" name = "email" class = "input-1"><br>
    <label for = "password" class = "label-1">Password:</label><br>
    <input type = "password" id = "password" name = "password" class = "input-1"><br>
    <input value="Submit" type="submit" class="button"/>
  <form>




<script>

      

  const userz = document.getElementById("personlist");


  const url = "https://everittcheng.tk/api/login/";

  const options = {
        method: 'POST',
        mode: 'cors', // no-cors, *cors, same-origin
        cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
        credentials: 'include', // include, *same-origin, omit
        body: JSON.stringify(body),
        headers: {
            "content-type": "application/json",
      },
  };


  function showList() {
    const email1 = document.getElementById("email").value;
    const password1 = document.getElementById("password").value;
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


              id.innerHTML = row.id;
              email.innerHTML = row.email;
              password.innerHTML = row.password;


              if (row.email == email1) {
                const passw = row.password;
                if(passw == password1) {
                    location.replace("https://ninjabreadlord.github.io/indochina/loginlist");
                }
                else {
                    window.alert("incorrect login");
                }
              }              
            }
        })
    })
    
  }


</script>