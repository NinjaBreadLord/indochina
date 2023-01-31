 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

  <form method="POST" id="createuser">
    <label for = "email" class = "label-1">Email:</label><br>
    <input type = "text" id = "email" name = "email" class = "input-1"><br>
    <label for = "password" class = "label-1">Password:</label><br>
    <input type = "password" id = "password" name = "password" class = "input-1"><br>
    <input value="Submit" type="submit" class="button"/>
  <form>


  

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


</script>