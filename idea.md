<html>
<head>

<style>
    .dropbtn {
    background-color: white;
    color: black;
    padding: 16px;
    font-size: 12px;
    border: none;
    cursor: pointer;
    margin-top: 10px;
    }

    .dropbtn:hover, .dropbtn:focus {
    background-color: #D3D3D3;
    }

    .dropdown {
    position: relative;
    display: inline-block;
    }

    .dropdown-content {
    display: none;
    position: absolute;
    background-color: #f1f1f1;
    min-width: 160px;
    overflow: auto;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
    }

    .dropdown-content a {
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
    }

    .p {
        color:black;
    }

    .dropdown a:hover {background-color: #ddd;}

    .show {display: block;}
</style>
</head>
<body>


<h1 style = "font-size:40px; text-align: center">
    Post Your Recipe
</h1>

<form action="/action_page.php" style = "margin-bottom:10px;">
  <label for="img">Select image of your recipe:</label>
  <input type="file" id="img" name="img" accept="image/*">
  <input type="submit" style = "margin-top:10px;">
</form>

<label for = "recipe" class = "label-1">Recipe Name:</label><br>
<input type = "text" id = "recipe" name = "recipe" class = "input-1"><br>
<label for = "region" class = "label-1">Region:</label><br>
<input type = "text" id = "recipe" name = "re" class = "input-1"><br>
<label for = "region" class = "label-1">Food Type:</label><br>
<input type = "text" id = "recipe" name = "re" class = "input-1"><br>
<label for = "region" class = "label-1">Prep Time:</label><br>
<input type = "text" id = "recipe" name = "re" class = "input-1"><br>
<label for = "region" class = "label-1">Is Spicy (yes/no):</label><br>
<input type = "text" id = "recipe" name = "re" class = "input-1"><br>
<label for = "freeform" class = "label-1">Recipe:</label><br>
<textarea id="freeform" name="freeform" rows="20" cols="100">
</textarea><br><br>


<input type="submit" style = "margin-top:10px">






<script>
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

