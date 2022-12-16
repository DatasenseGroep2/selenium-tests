package heroku.api;

import heroku.hooks.DefaultHooks;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static io.restassured.RestAssured.when;

public class ApiPlayerFirstNameTest extends DefaultHooks {
    @Test(groups = {"API", "Spelers"}, description = "This test controls if the API and the frontend show the same data")
    public void APIGivesCorrectDataFirstNamePlayer() throws InterruptedException {
        final String url = "http://localhost:8080/";
        final String endpoint = "footballers";
        //this get all the players from the database
        Response response = when().get(url + endpoint);
        String spelers = response.body().asPrettyString();
        List<String> spelerslijst = Arrays.stream(spelers.split("},")).toList();
        List<String> spelerinfoFirstspeler = Arrays.stream(spelerslijst.get(0).split(",")).toList();
        String spelersAPIFirstName = spelerinfoFirstspeler.get(1);
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        String spelersPageFirstName = pages.spelerspage.getSpelersFirstName();
        pages.spelerspage.navigateToDetailPagePlayer();
        boolean testPassed;
        testPassed = spelersAPIFirstName.contains(spelersPageFirstName);
        if (testPassed){
            System.out.println("API en Speler page has the same firstname test passed");
        }else {
            System.out.println("API en Speler page does not have the same firstname test failed");
        }
        assertThat(spelersAPIFirstName).contains(spelersPageFirstName);
    }
}
