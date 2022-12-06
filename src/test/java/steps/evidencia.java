package steps;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriversFactory;

import java.io.File;
import java.io.IOException;

public class evidencia extends DriversFactory {

        public static void takeScreen(String evidecia){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File srcDestine = new File("./evdencia/"+evidecia+".png");
            try {
                FileUtils.copyFile(srcFile,srcDestine);
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("fail to runner the test");
                System.out.println(e.getCause());
                System.out.println(e.getMessage());
            }
        }
    }



