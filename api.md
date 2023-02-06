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
        var data = JSON.parse(this.response)
        if (request.status >= 200 && request.status < 400) {
                    HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://tasty.p.rapidapi.com/recipes/list"))
                    .header("X-RapidAPI-Key", "bc9e5f20f9mshfceb3f679afd2b7p1960cdjsn87cb096651ab")
                    .header("X-RapidAPI-Host", "tasty.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        })
    } else {
        const errorMessage = document.createElement('marquee')
        errorMessage.textContent = `This isn't working sadly`
        app.appendChild(errorMessage)
    }
    }
</script>
</html>