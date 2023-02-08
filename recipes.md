---
layout: page
title: Recipes List
---
<h1 style = "text-align: center">Logins List</h1>

<table id = "personlist">
    <thead>
      <tr>
        <th>ID</th>
        <th>Recipes</th>
        <th>Ingredients</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody></tbody>
</table>

<script>
    const userz = document.getElementById("personlist");


  const url = "https://everittcheng.tk/api/cookingwebsite/";

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
              const recipe = document.createElement("td");
              const ingredients = document.createElement("td");
              const description = document.createElement("td");



              id.innerHTML = row.id;
              recipe.innerHTML = row.recipe;
              ingredients.innerHTML = row.ingredients;
              description.innerHTML = row.description;



              tr.appendChild(id);
              tr.appendChild(recipe);
              tr.appendChild(ingredients);
              tr.appendChild(description);



              userz.appendChild(tr);
            }
        })
    })
  }

  showList();
</script>