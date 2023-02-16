{% include home.html %}

<h1 style = "text-align: center">Search by Country</h1>



  <form action="javascript:showList()">
    <label for = "country" class = "label-1">Country:</label><br>
    <input type = "text" id = "country" name = "country" class = "country"><br>
    <input value="Submit" type="submit" class="button"/>
  <form>

<table id = "personlist">
    <thead>
      <tr>
        <th>name</th>
        <th>ingredients</th>
        <th>description</th>
        <th>country</th>
        <th>preparation</th>
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
  const country1 = document.getElementById("country");
  const url = "http://localhost:8195/api/recipes/all";
  // const url = "https://everittcheng.tk/api/person/";

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
                if(row.country == country1) {
                    const tr = document.createElement("tr");

                    const name = document.createElement("td");
                    const ingredients = document.createElement("td");
                    const description = document.createElement("td");
                    const country = document.createElement("td");
                    const preparation = document.createElement("td");


                    name.innerHTML = row.name;
                    ingredients.innerHTML = row.ingredients;
                    description.innerHTML = row.description;
                    country.innerHTML = row.country;
                    preparation.innerHTML = row.preparation;



                    tr.appendChild(name);
                    tr.appendChild(ingredients);
                    tr.appendChild(description);
                    tr.appendChild(country);
                    tr.appendChild(preparation);



                    userz.appendChild(tr);

                }

            }
        })
    })
  }

  showList();
</script>








