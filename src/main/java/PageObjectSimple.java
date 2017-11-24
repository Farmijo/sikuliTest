import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Screen;

import javax.xml.bind.annotation.XmlElementDecl;
import java.util.HashMap;
import java.util.Map;

public class PageObjectSimple {
    private Screen screen;

    private ImageElement key9;
    private ImageElement key8;
    private Map<Integer,ImageElement> keyMap;


    PageObjectSimple(Screen screen){
        this.screen=screen;
        try{
        this.key9 = new ImageElement("images/9.png");
        this.key8 = new ImageElement("images/8.png");}
        catch (Exception e){System.out.println("Constructor failed");}

        this.keyMap = new HashMap<Integer,ImageElement>();
        keyMap.put(9, key9);
        keyMap.put(8, key8);
    }


    public PageObjectSimple clickNumber(int number){

        try{
        screen.click(keyMap.get(number).getPath());
        }
        catch (Exception e){
            System.out.println("\033[31m EXCEPTION HANDLED: Click was not done! Test failed");
            System.exit(1);
        }


        return this;
    }



}