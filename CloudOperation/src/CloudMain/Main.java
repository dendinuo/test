package CloudMain;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	
	 static {
		 System.setProperty("webdriver.chrome.driver","D:\\webDriver\\chromedriver.exe");//chromedriver服务地址	 
	 }
	public static WebDriver driver =new ChromeDriver();
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		Login login = new Login();
//        UserManage obj1 = new UserManage();
//        PageIndex obj2 = new PageIndex();
        HomePage page = new HomePage();
        CustomMethod method= new CustomMethod();
        RandomValues random = new RandomValues(); 
        
        login.login();             //登录
        page.modify_information();   //修改个人信息
        page.homepage_img();//首页图标点击测试

		//obj1.CreateUser(); //创建用户
        //mainobj.waitforElement();
     
        
        
 //       System.out.println(method.RandomA(13000000000, 13999999999));
        
        
        Thread.sleep(5000); 
        System.out.println("程序已运行完成，未报错！！");
        driver.quit();//退出浏览器
    }
	
}