package AluraExercicios.APIs.Executavel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Receitas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Comida:");
        var comida = scan.nextLine();

        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s="+ comida;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
        HttpResponse<String> response = cliente.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
