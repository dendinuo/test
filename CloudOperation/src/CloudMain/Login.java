package CloudMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public void login() throws InterruptedException  {	
		
		Main.driver.get("http://183.230.102.51:10001/login.html");//打开指定网站地址
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);//等待元素100秒
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imgValidate")));
		Thread.sleep(500); //进程等待500毫秒
		Main.driver.findElement(By.id("loginUserName")).sendKeys("test");
		Main.driver.findElement(By.id("loginPassword")).sendKeys(new String[] {"666666"});
		Main.driver.findElement(By.name("identCode")).sendKeys(new String[] {"9999"});
		Main.driver.manage().window().maximize();//窗口最大化
        Thread.sleep(1000);
        //driver.findElement(By.id("form_submit")).click(); //点击按扭
        Main.driver.findElement(By.xpath("//*[@id='form_submit']")).click();
        //登陆成功，进入首页    
        
        
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	}

	

}
