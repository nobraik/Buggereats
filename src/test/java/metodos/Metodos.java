package metodos;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriversFactory;

import java.time.Duration;

public class
Metodos extends DriversFactory {
    Faker faker = new Faker();
    public void escrever(By Elemeneto){
        driver.findElement(Elemeneto).sendKeys(faker.name().fullName());


    }


    public void clicar(By clicarElement){
      driver.findElement(clicarElement).click();


    }
public void digitar(String texto ,By elemento){

        driver.findElement(elemento).sendKeys(texto);

}


    public void waitElement(By elemento) {
        WebElement webElement = new WebDriverWait(driver, Duration.ofMillis(2000)).until(ExpectedConditions.elementToBeClickable(elemento));
        webElement.click();

    }

    public void scrollPage(int n1,int n2){
      JavascriptExecutor jsscroll = (JavascriptExecutor) driver;
      jsscroll.executeScript("window.scrollBy("+n1+","+n2+")");
    }

    }

