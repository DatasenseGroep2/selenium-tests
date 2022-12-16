package heroku.system.navigate;

import heroku.hooks.DefaultHooks;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class NavigateTests extends DefaultHooks {
        @Test(groups = {"Nav", "Home"}, description = "This test checks if the user can navigate from the registerpage to homepage")
        public void navFromRegisterToHomePageTest(){
            pages.homePage.navToRegister();
            pages.homePage.clickNavBar();
            pages.homePage.navToHome();
            boolean testPassed;
            testPassed = pages.registerPage.getURL().contains("/home");
            if (testPassed){
                System.out.println("Navigation to homepage works test passed");
            }else {
                System.out.println("Navigation to homepage does not work test failed");
            }
            assertThat(pages.homePage.getURL()).contains("/home");
        }

        @Test(groups = {"Nav", "Spelers"}, description = "This test checks if the user can navigate from the homepage to spelerspage")
        public void navFromHomeToSpelersPageTest(){
            pages.homePage.navToSpelers();
            boolean testPassed;
            testPassed = pages.registerPage.getURL().contains("/players");
            if (testPassed){
                System.out.println("Navigation to playerspage works test passed");
            }else {
                System.out.println("Navigation to playerspage does not work test failed");
            }
            assertThat(pages.spelerspage.getURL()).contains("/players");
        }

        @Test(groups = {"Nav", "Register"}, description = "This test checks if the user can navigate from the homepage to the registerpage")
        public void navFromHomeToRegisterPageTest(){
            pages.homePage.navToRegister();
            boolean testPassed;
            testPassed = pages.registerPage.getURL().contains("/register");
            if (testPassed){
                System.out.println("Navigation to registerpage works test passed");
            }else {
                System.out.println("Navigation to registerpage does not work test failed");
            }
            assertThat(pages.registerPage.getURL()).contains("/register");
        }
    @Test(groups = {"Nav", "Spelers"}, description = "This test checks if the user can navigate from the homepage to the spelerspage to the detailpage of a player")
        public void navFromHomeToSpelersPageToDetailPageSpelerTest() throws InterruptedException {
            pages.homePage.navToSpelers();
            pages.spelerspage.navigateTo();
            pages.spelerspage.navigateToDetailPagePlayer();
            boolean testPassed;
            testPassed = pages.spelerspage.getSpelersLastName().equals("Mccallum");
            if (testPassed){
                System.out.println("Navigation to detail page player works test passed");
            }else {
                System.out.println("Navigation to detail page player does not work test failed");
            }
            assertThat(pages.spelerspage.getSpelersLastName()).isEqualTo("Mccallum");
        }
}
