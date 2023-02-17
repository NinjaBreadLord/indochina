 {% include home.html %}

<style>

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

</style>

 <h1 style = "text-align: center">Create Recipe</h1>

<form id="createrecipe">
    <label for="name">Name of Recipe:</label>
    <input type="text" id="name" name="name" required>
    <label for="ingredients">Ingredients:</label>
    <input type="text" id="ingredients" name="ingredients" required>
    <label for="description">Description:</label>
    <textarea id="description" name="description" rows="20" cols="100">
    </textarea>
    <label for="region">Region:</label>
    <select id="region" name="region">
      <option value="The Americas">Americas</option>
      <option value="East and Southeast Asia">East and Southeast Asia</option>
      <option value="Subsaharan Africa">Africas</option>
      <option value="South Asia">South Asia</option>
      <option value="MiddleEast, North Africa, Central Asia">Middle East, North Africa, Central Asia</option>
      <option value="Europe">Europe</option>
      <option value="Oceania">Oceania</option>
    </select>
    <label for="preparation">Preparation Time(Just Enter # of Minutes):</label>
    <input type="text" id="preparation" name="preparation" required>
  <button type="submit">Create Recipe</button>
</form>


  

<script>

  function inputper(event) {
      event.preventDefault();

      const data = new FormData(event.target);
      const urldata = new URLSearchParams(data).toString();


      //Lowkey ion think this should be local host
      fetch("https://everittcheng.tk/api/recipes/post/?" + urldata, {
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