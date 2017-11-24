import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.sikuli.script.Screen;

import java.io.File;
import java.io.IOException;

public class environment {
    public static WiniumDriver setupEnvironment() throws IOException{

        String ApplicationPath = "C:/windows/system32/calc.exe";
        String winiumDriverPath = "Winium.Desktop.Driver.exe";

        DesktopOptions options = new DesktopOptions(); //Initiate Winium Desktop Options
        options.setApplicationPath(ApplicationPath); //Set outlook application path

        File drivePath = new File(winiumDriverPath); //Set winium driver path

        WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(drivePath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
        try{ service.start();}
        catch (Exception e){}

        //Build and Start a Winium Driver service
        WiniumDriver driver = new WiniumDriver(service, options); //Start a winium driver

        return driver;

    }

}


