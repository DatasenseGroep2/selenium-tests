package heroku.Match;

import heroku.hooks.DefaultHooks;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class MatchTests extends DefaultHooks {
    /*@Test (groups = {"Spelers", "Matches"}, description = "This test checks if the match info of the first match is displayed correctly")
    public void MatchOneSelectorTest() throws InterruptedException {
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        pages.spelerspage.ClickMatchSelector();
        pages.spelerspage.ClickFirstMatchOption();
        pages.spelerspage.ClickSecondMatchOption();
        assertThat(pages.spelerspage.printMatchInfo()).isEqualTo("You selected: 2022-10-15\n" +
                "Tegenspeler: KRC Genk\n" +
                "Score: 1 : 0\n" +
                "Gele Kaarten voor Tierney Mccallum : 0\n" +
                "Rode Kaart : false");
    }

    @Test (groups = {"Spelers", "Matches"}, description = "This test checks if the match info of the second match is displayed correctly")
    public void MatchTwoSelector () throws InterruptedException {
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        pages.spelerspage.ClickMatchSelector();
        pages.spelerspage.ClickSecondMatchOption();
        pages.spelerspage.ClickThirdMatchOption();
        assertThat(pages.spelerspage.printMatchInfo()).isEqualTo("You selected: 2022-10-22\n" +
                "Tegenspeler: Club Brugge\n" +
                "Score: 1 : 1\n" +
                "Gele Kaarten voor Tierney Mccallum : 0\n" +
                "Rode Kaart : false");
    }

    @Test (groups = {"Spelers", "Matches"}, description = "This test checks if the match info of the third match is displayed correctly")
    public void MatchThreeSelector () throws InterruptedException {
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        pages.spelerspage.ClickMatchSelector();
        pages.spelerspage.ClickThirdMatchOption();
        pages.spelerspage.ClickSecondMatchOption();
        assertThat(pages.spelerspage.printMatchInfo()).isEqualTo("You selected: 2022-10-29\n" +
                "Tegenspeler: Anderlecht\n" +
                "Score: 2 : 0\n" +
                "Gele Kaarten voor Tierney Mccallum : 0\n" +
                "Rode Kaart : false");
    }

    @Test (groups = {"Spelers", "Matches"}, description = "This test checks if the match info of the fourth match is displayed correctly")
    public void MatchFourSelector () throws InterruptedException {
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        pages.spelerspage.ClickMatchSelector();
        pages.spelerspage.ClickFourthMatchOption();
        pages.spelerspage.ClickSecondMatchOption();
        assertThat(pages.spelerspage.printMatchInfo()).isEqualTo("You selected: 2022-11-05\n" +
                "Tegenspeler: STVV\n" +
                "Score: 3 : 2\n" +
                "Gele Kaarten voor Tierney Mccallum : 0\n" +
                "Rode Kaart : false");
    }

    @Test (groups = {"Spelers", "Matches"}, description = "This test checks if the match info of the fifth match is displayed correctly")
    public void MatchFifthSelector () throws InterruptedException {
        pages.homePage.navToSpelers();
        pages.spelerspage.navigateTo();
        pages.spelerspage.navigateToDetailPagePlayer();
        pages.spelerspage.ClickMatchSelector();
        pages.spelerspage.ClickFifthMatchOption();
        pages.spelerspage.ClickSecondMatchOption();
        assertThat(pages.spelerspage.printMatchInfo()).isEqualTo("You selected: 2022-11-12\n" +
                "Tegenspeler: KFC Alken\n" +
                "Score: 1 : 3\n" +
                "Gele Kaarten voor Tierney Mccallum : 0\n" +
                "Rode Kaart : false");
    }*/
}
