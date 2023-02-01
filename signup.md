 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

  <form action="javascript:check()">
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
      method: 'GET', 
      mode: 'cors', 
      cache: 'default', 
      credentials: 'omit', 
      headers: {
      'Content-Type': 'application/json'
      },
  };


  function check() {
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
                window.alert("This email has already been used");
              }
              else {
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

              }              
            }
        })
    })
    
  }
      

 


</script>