import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.*;

public class Recipe {
    public static void main(String[] args ) throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://tasty.p.rapidapi.com/recipes/auto-complete?prefix=chicken%20soup"))
        .header("X-RapidAPI-Key", "bc9e5f20f9mshfceb3f679afd2b7p1960cdjsn87cb096651ab")
        .header("X-RapidAPI-Host", "tasty.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}