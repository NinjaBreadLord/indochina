{% include home.html %}

<button onclick="deletecookie()">Click me</button>

<h1 style = "text-align: center">Recipes List</h1>

<table id = "personlist">
    <thead>
      <tr>
        <th style = "width: 100px;">Name</th>
        <th style = "width: 100px;">Region</th>
        <th style = "width: 50px;">Prep Time</th>
        <th style = "width: 200px;">Ingredients</th>
        <th style = "width: 400px;">Description</th>
      </tr>
    </thead>
    <tbody></tbody>
</table>

<script>
//   function checkJwtCookie() {
//     if (document.cookie.indexOf("jwt=") === -1) {
//       // JWT cookie is missing, redirect user to login page
//       window.location.href = "/indochina/";
//     }
//   }

// // Call checkJwtCookie() when page loads
//   checkJwtCookie();
  const userz = document.getElementById("personlist");

  // const url = "https://everittcheng.tk/api/recipes/all";
  const url = "http://localhost:8195/api/recipes/all";

  const options = {
      method: 'GET', 
      mode: 'cors', 
      cache: 'no-cache', 
      credentials: 'include', 
      headers: {
      'Content-Type': 'application/json'
      },
  };


  function showList() {
    fetch(url, options)
      .then(response => {
        if (response.status === 401) {
            window.location.href = '/indochina/restricted'; // redirect to the login page
        }     
        else if (response.status !== 200) {
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

              const name = document.createElement("td");
              const ingredients = document.createElement("td");
              const description = document.createElement("td");
              const region = document.createElement("td");
              const preparation = document.createElement("td");


              name.innerHTML = row.name;
              ingredients.innerHTML = row.ingredients;
              description.innerHTML = row.description;
              region.innerHTML = row.region;
              preparation.innerHTML = row.preparation;



              tr.appendChild(name);
              tr.appendChild(region);
              tr.appendChild(preparation);
              tr.appendChild(ingredients);
              tr.appendChild(description);



              userz.appendChild(tr);
            }
        })
    })
  }
  function deletecookie() {
    document.cookie = "jwt=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
    window.alert("cookie delete");
  }
  
  showList();
</script>








