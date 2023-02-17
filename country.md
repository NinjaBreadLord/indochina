{% include home.html %}

<h1 style = "text-align: center">Search by Region</h1>



  <form action="javascript:showList()">
    <label for = "country" class = "label-1">Country:</label><br>
    <input type = "text" id = "country" name = "country" class = "country"><br>
    <input value="Submit" type="submit" class="button"/>
  <form>

<table id = "personlist">
    <thead>
      <tr>
        <th>Name</th>
        <th>Ingredients</th>
        <th>Description</th>
        <th>Region</th>
        <th>Preparation Time</th>
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
  
  const url = "https://everittcheng.tk/api/recipes/all";
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
    const country1 = document.getElementById("country").value;
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
                if(row.region == country1) {
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
                    tr.appendChild(ingredients);
                    tr.appendChild(description);
                    tr.appendChild(region);
                    tr.appendChild(preparation);



                    userz.appendChild(tr);

                }
                else {
                    window.alert("There are no recipes in this region");
                }

            }
        })
    })
  }


</script>








