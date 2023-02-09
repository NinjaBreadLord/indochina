 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

<form id="createuser">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

  
  <button type="submit">Create Account</button>
</form>


  

<script>

  function inputper(event) {
      event.preventDefault();

      const data = new FormData(event.target);
      const urldata = new URLSearchParams(data).toString();

      fetch("http://localhost:8195/api/login/post/?" + urldata, {
        method: "POST",
        mode: "no-cors",
        headers: {
          "Content-Type": "application/json"
        }
      })
  }

  const make = document.getElementById("createuser");
  make.addEventListener("submit", inputper);


</script>