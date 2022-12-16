package heroku.system.visual;

import heroku.hooks.DefaultHooks;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class ImageVisibleTest extends DefaultHooks {
    @Test(groups = {"Image", "Home"}, description = "This test checks if the homePage contains the logo of the club")
    public void homePageContainsLogoTest(){
        pages.homePage.navToHome();
        boolean testPassed;
        if (pages.homePage.ImageIsvisible()){
            testPassed = true;
        }else {
            testPassed = false;
        }
        if (testPassed){
            System.out.println("Homepage contains logo from club");
        }else {
            System.out.println("Logo is missing on homepage test failed");
        }
        assertThat(pages.homePage.ImageIsvisible()).isTrue();
    }

    @Test(groups = {"Image", "Spelers"}, description = "This test checks if the spelerspage contains the logo of the club")
    public void spelersPageContainsLogoTest(){
        pages.homePage.navToSpelers();
        boolean testPassed;
        if (pages.spelerspage.ImageIsvisible()){
            testPassed = true;
        }else {
            testPassed = false;
        }
        if (testPassed){
            System.out.println("Spelerspage contains logo from club");
        }else {
            System.out.println("Logo is missing on spelerspage test failed");
        }
        assertThat(pages.spelerspage.ImageIsvisible()).isTrue();

    }

    @Test(groups = {"Image", "Register"}, description = "This test checks if the registerpage contains the logo of the club")
    public void registerPageContainsLogoTest(){
        pages.homePage.navToRegister();
        boolean testPassed;
        if (pages.registerPage.ImageIsvisible()){
            testPassed = true;
        }else {
            testPassed = false;
        }
        if (testPassed){
            System.out.println("Registerpage contains logo from club");
        }else {
            System.out.println("Logo is missing on registerpage test failed");
        }
        assertThat(pages.registerPage.ImageIsvisible()).isTrue();
    }
}