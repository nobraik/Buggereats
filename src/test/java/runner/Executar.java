package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriversFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "steps",
        tags = "@teste",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)


public class Executar extends DriversFactory {

    public void iniciarDaQui() {
        String browser = ("chrome");
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println(" voce esta usando o navegador" + browser + " para o teste ");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        this.action();
    }
}
