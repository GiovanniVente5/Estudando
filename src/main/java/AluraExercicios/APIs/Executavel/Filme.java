package AluraExercicios.APIs.Executavel;

import AluraExercicios.APIs.Classes.Titulo;
import AluraExercicios.APIs.Classes.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Filme {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filme:");
        var busca = scan.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=54819492";
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = cliente.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);

        System.out.println("Titulo OMDB: " + tituloOmdb.toString());
        Titulo titulo =  new Titulo(tituloOmdb);

        System.out.println("Titulo normal: " + titulo.toString());
    }
}
