package CloudMain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
/***
 * 
 * 本类仅供测试
 * ***/
public class TestPage {

	public static void pressKeyEvent(int keycode) throws AWTException {  
	    Robot robot = new Robot();  
        robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyPress(keycode);  
	}  
    public static void refresh(WebDriver driver) throws AWTException {  
        Actions ctrl = new Actions(Main.driver);  
        ctrl.keyDown(Keys.CONTROL).perform();    
            pressKeyEvent(KeyEvent.VK_F5);  
       
        ctrl.keyUp(Keys.CONTROL).perform();  
//      driver.navigate().refresh();  
    }  
	
	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		/**Main.driver.get("C:\\Users\\admin\\Desktop\\js\\index.html");
		
		String s = LoadJQueryLib.getInstance().getJs_str(Main.driver, "return $('#username').attr('id')");
		System.out.println(s);
		**/
		Actions action = new Actions(Main.driver); 
		 
		Main.driver.get("C:\\Users\\admin\\Desktop\\js\\index.html");
		for(int i=0;i<=20;i++) {
			Main.driver.navigate().refresh();
		}
		
		
	}

}
