package AluraExercicios.APIs.Classes;

import com.google.gson.annotations.SerializedName;

public record TituloOmdb(String title, String year, String runtime, String genre, @SerializedName("imdbRating") String imdbrating) {
}
