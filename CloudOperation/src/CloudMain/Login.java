package CloudMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public void login() throws InterruptedException  {	
		
		Main.driver.get("http://183.230.102.51:10001/login.html");//��ָ����վ��ַ
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);//�ȴ�Ԫ��100��
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imgValidate")));
		Thread.sleep(500); //���̵ȴ�500����
		Main.driver.findElement(By.id("loginUserName")).sendKeys("test");
		Main.driver.findElement(By.id("loginPassword")).sendKeys(new String[] {"666666"});
		Main.driver.findElement(By.name("identCode")).sendKeys(new String[] {"9999"});
		Main.driver.manage().window().maximize();//�������
        Thread.sleep(1000);
        //driver.findElement(By.id("form_submit")).click(); //�����Ť
        Main.driver.findElement(By.xpath("//*[@id='form_submit']")).click();
        //��½�ɹ���������ҳ    
        
        
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	}

	

}
