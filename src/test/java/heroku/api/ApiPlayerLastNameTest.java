package heroku.api;

import heroku.hooks.DefaultHooks;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static io.restassured.RestAssured.when;

public class ApiPlayerLastNameTest extends DefaultHooks {
    @Test(groups = {"API"}, description = "This test controls if the API and the frontend show the same data")
    public void APIGivesCorrectDataLastNamePlayer() throws InterruptedException {
        final String url = "http://localhost:8080/";
        final String endpoint = "footballers";
        //this get all the players from the database
        Response response = when().get(url + endpoint);
        String spelers = response.body().asPrettyString();
        List<String> spelerslijst = Arrays.stream(spelers.split("},")).toList();
        List<String> spelerinfoFirstspeler = Arrays.stream(spelerslijst.get(0).split(",")).toList();
        String spelersAPILastName = spelerinfoFirstspeler.get(2);
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        String spelersPageLastName = pages.spelerspage.getSpelersLastName();
        boolean testPassed;
        testPassed = spelersAPILastName.contains(spelersPageLastName);
        if (testPassed){
            System.out.println("API en Speler page has the same lastname test passed");
        }else {
            System.out.println("API en Speler page does not have the same lastname test failed");
        }
        assertThat(spelersAPILastName).contains(spelersPageLastName);
    }

}
