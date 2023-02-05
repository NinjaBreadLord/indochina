<!DOCTYPE html>
<html lang="en">
  <head>
  <style>
    #root {
        max-width: 1200px;
        margin: 0 auto;
    }
    .container {
    display: flex;
    flex-wrap: wrap;
    }
    .card {
    margin: 1rem;
    border: 1px solid gray;
    }
    @media screen and (min-width: 600px) {
    .card {
        flex: 1 1 calc(50% - 2rem);
    }
    }
    @media screen and (min-width: 900px) {
    .card {
        flex: 1 1 calc(33% - 2rem);
    }
    }
  </style>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Recipe API</title>
    <link href="https://fonts.googleapis.com/css?family=Dosis:400,700" rel="stylesheet" />
  </head>

  <body>
    <div id="root"></div>
  </body>
  <script>
    // Create a request variable and assign a new XMLHttpRequest object to it.
    var request = new XMLHttpRequest()
    // Open a new connection, using the GET request on the URL endpoint
    request.open('GET', 'https://ghibliapi.herokuapp.com/films', true)
    request.onload = function () {
    }
    request.send()
    </script>
</html>