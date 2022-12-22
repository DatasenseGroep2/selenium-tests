package heroku.api;

import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.when;

public class RestAPITest {
    public static void main(String[] args) {
        List<String> spelerinfoFirstspeler;
        final String url = "http://localhost:8080/";
        final String endpoint = "footballers";
        //this get all the players from the database
        Response response = when().get(url + endpoint);
        String spelers = response.body().asPrettyString();
        List<String> spelerslijst = Arrays.stream(spelers.split("},")).toList();
        spelerinfoFirstspeler = Arrays.stream(spelerslijst.get(0).split(",")).toList();
        System.out.println("Alle spelers in de database");
        System.out.println(spelers);
        System.out.println("Firstname of the first player in the database");
        System.out.println(spelerinfoFirstspeler.get(1));
    }
}
