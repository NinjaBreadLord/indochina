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
    <div class="container"></div>
  </body>
  <script>
    const app = document.getElementById('root')
    const container = document.createElement('div')
    container.setAttribute('class', 'container')
    app.appendChild(container)
    var request = new XMLHttpRequest()
    request.open('GET', 'https://tasty.p.rapidapi.com/recipes/list', true)
    request.onload = function () {
    // Begin accessing JSON data here
    var data = JSON.parse(this.response)
    if (request.status >= 200 && request.status < 400) {
        data.forEach((recipe) => {
        const card = document.createElement('div')
        card.setAttribute('class', 'card')
        const h1 = document.createElement('h1')
        h1.textContent = recipe.title
        const p = document.createElement('p')
        recipe.description = recipe.description.substring(0, 300)
        p.textContent = `${recipe.description}...`
        container.appendChild(card)
        card.appendChild(h1)
        card.appendChild(p)
        })
    } else {
        const errorMessage = document.createElement('marquee')
        errorMessage.textContent = `This isn't working sadly`
        app.appendChild(errorMessage)
    }
    }
    request.send()
</script>
</html>