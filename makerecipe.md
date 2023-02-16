 {% include home.html %}
 <h1 style = "text-align: center">Create Recipe</h1>

<form id="createrecipe">
    <label for="name">Name:</label>
    <input type="name" id="name" name="name" required>
    <label for="ingredients">Ingredients:</label>
    <input type="ingredients" id="ingredients" name="ingredients" required>
    <label for="description">Description:</label>
    <input type="description" id="description" name="description" required>
    <label for="country">Country:</label>
    <input type="country" id="country" name="country" required>
    <label for="description">Description:</label>
    <input type="description" id="description" name="description" required>

  
  <button type="submit">Create Account</button>
</form>


  

<script>

  function inputper(event) {
      event.preventDefault();

      const data = new FormData(event.target);
      const urldata = new URLSearchParams(data).toString();


      //Lowkey ion think this should be local host
      fetch("http://localhost:8195/api/recipes/post/?" + urldata, {
        method: 'POST', 
        mode: 'cors', 
        cache: 'no-cache', 
        credentials: 'include', 
        headers: {
          "Content-Type": "application/json"
        }
      })
      window.alert("recipe created successfully");
  }

  const make = document.getElementById("createrecipe");
  make.addEventListener("submit", inputper);


</script>