package heroku.api;

import heroku.hooks.DefaultHooks;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static io.restassured.RestAssured.when;

public class ApiPlayerStrongfootTest extends DefaultHooks {
    @Test(groups = {"API"}, description = "This test checks if the strong foot of the player is displayed correctly")
    public void getPlayerPosition() throws InterruptedException {
        final String url = "http://localhost:8080/";
        final String endpoint = "footballers";
        //this get all the players from the database
        Response response = when().get(url + endpoint);
        String spelers = response.body().asPrettyString();
        List<String> spelerslijst = Arrays.stream(spelers.split("},")).toList();
        List<String> spelerinfoFirstspeler = Arrays.stream(spelerslijst.get(0).split(",")).toList();
        String spelersAPIPosition = spelerinfoFirstspeler.get(9);
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        String spelerspagePlayerStrongfoot = pages.spelerspage.getPlayerStrongFoot();
        boolean testPassed;
        testPassed = spelersAPIPosition.contains(spelerspagePlayerStrongfoot);
        if (testPassed) {
            System.out.println("API en Speler page has the same strong foot test passed");
        } else {
            System.out.println("API en Speler page does not have the same strong foot test failed");
        }
        assertThat(spelersAPIPosition).contains(spelerspagePlayerStrongfoot);
    }
}
