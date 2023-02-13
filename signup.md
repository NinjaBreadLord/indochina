 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

<form id="createuser">
    <label for="name">Name:</label>
    <input type="name" id="name" name="name" required>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <label for="dob">Date of Birth (MO-DA-YEAR):</label>
    <input type="dob" id="dob" name="dob" required>

  
  <button type="submit">Create Account</button>
</form>


  

<script>

  function inputper(event) {
      event.preventDefault();

      const data = new FormData(event.target);
      const urldata = new URLSearchParams(data).toString();

      const url = "https://breadbops.gq/api/person/post?email=" + email +"&password=" + password + "&name=" + name + "&dob=" + dob;
      //Lowkey ion think this should be local host
      fetch("https://everittcheng.tk/api/person/post/?" + urldata, {
        method: 'POST', 
        mode: 'cors', 
        cache: 'no-cache', 
        credentials: 'include', 
        headers: {
          "Content-Type": "application/json"
        }
      })
      window.alert(urldata);
  }

  const make = document.getElementById("createuser");
  make.addEventListener("submit", inputper);


</script>