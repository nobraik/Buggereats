package utils;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriversFactory {

   public static WebDriver driver;
   public void action(){
       String urlbase = ("https://buger-eats.vercel.app/deliver");
       driver.manage().window().maximize();

       driver.get(urlbase);

   }

   @After
   public static void encerrarTest() throws InterruptedException {
       TimeUnit.MILLISECONDS.sleep(2000);
       driver.quit();
   }
}
