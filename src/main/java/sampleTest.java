import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.*;
import java.net.MalformedURLException;


public class sampleTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        try{

            WiniumDriver driver = environment.setupEnvironment();
            Screen screen= new Screen();
            PageObjectSimple calculadora= new PageObjectSimple(screen);
            calculadora.clickNumber(9).clickNumber(8).clickNumber(9);
            driver.close();


        }
        catch (Exception e){
            System.out.println("Test Failed!");
        }



    }
}
