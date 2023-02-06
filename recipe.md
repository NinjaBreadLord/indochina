<div id="recipes">
</div>
  <table id="recipe-table">
    <tr>
        <th>Recipe</th>
    </tr>
</table>

<script>

let table = document.getElementById("recipes");

function printRecipe() {
    // Fetch data from API
    fetch("https://everittcheng.tk/api/recipe/list")
    .then(response => response.json())
    .then(data =>  {
              const table = document.getElementById('recipe-table');
          });
      };
</script>
