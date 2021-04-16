package IntegrationTest.navigation;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


import java.util.logging.Logger;

import static java.lang.Thread.sleep;


public class NavigateTo {

    BunningsPage bunningsPage;
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    public void bunningshomePage() {
          waitfortheelement();
          String bunningsURL = getConfigurationDetails("webdriver.base.url");
          bunningsPage.getDriver().get(bunningsURL);
    }


    public String getConfigurationDetails(String nameURL) {
        EnvironmentVariables props = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        String configDetails = EnvironmentSpecificConfiguration.from(props).getProperty(nameURL);
        return configDetails;
    }

    public void searchProdcts(String searchString) {

        bunningsPage.getDriver().findElement(By.xpath("//div[contains(@class,'search-container')]//input")).sendKeys(searchString);
    }

    public void clickSearchButton(String searchButton) {
         waitfortheelement();
         Actions action = new Actions(bunningsPage.getDriver());
         action.sendKeys(Keys.RETURN).build().perform();
         waitfortheelement();

    }

    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}






