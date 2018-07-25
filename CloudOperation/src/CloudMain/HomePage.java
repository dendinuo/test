package CloudMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class HomePage {

	public void modify_information() throws InterruptedException, IOException, AWTException {
		
		RandomValues random= new RandomValues();
		CustomMethod method = new CustomMethod();
		
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);//��ʾ�ȴ�100��
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeImg-head")));
		Thread.sleep(500); 
		Main.driver.findElement(By.id("homeImg-head")).click();//���ͷ��ͼ��
		Thread.sleep(500); 
		WebElement iframe37 = Main.driver.findElement(By.xpath("//*[@name=\"iframe37\"]"));
		Main.driver.switchTo().frame(iframe37);Thread.sleep(500); //��λframe��ܲ��л�
		Main.driver.findElement(By.id("editInfoBtn"));//���ҵ����޸ĸ�����Ϣ����ť
		
		for(int i=1;i<=10;i++) {
			((JavascriptExecutor)Main.driver).executeScript("arguments[0].scrollIntoView(true);",Main.driver.findElement(By.id("editInfoBtn")));//�����ƶ�������ֱ��ָ��Ԫ�ؿɼ�Ϊֹ
			Thread.sleep(500); 	
			Main.driver.findElement(By.id("editInfoBtn")).click();Thread.sleep(500); 			
			String s = LoadJQueryLib.getInstance().getJs_str(Main.driver, "return $('#userDuty').attr('disabled')");
			if(s==null) {System.out.println("�ɹ������޸�ҳ�棡");break;}  //ͨ������jQuery�������js���ȡ��Ŀ���ǩ������ֵdisabled����Ϊѭ����������				
		}
		
		Main.driver.findElement(By.id("img-head")).click();Thread.sleep(500); 
/***�ϴ�ͷ������Autolt����***/		
		Runtime exe = Runtime.getRuntime();
        // Java ��Runtime ģ���getruntime.exec()�������Ե���exe ����ִ�С�
        try {
            String str = "C:\\Users\\admin\\Documents\\666.exe";
            exe.exec(str);
            // ����ָ��λ�õ�.exe�ļ�
        } catch (IOException e) {
            System.out.println("Error to run the exe");
            e.printStackTrace();
        }
        System.out.println("ͷ�����ϴ���ɣ���");
	
		Thread.sleep(500); 
		((JavascriptExecutor)Main.driver).executeScript("arguments[0].scrollIntoView(true);",Main.driver.findElement(By.id("saveNewInfoBtn")));
		Thread.sleep(500); 		
		Main.driver.findElement(By.id("userDuty")).clear();Thread.sleep(500); 
		Main.driver.findElement(By.id("userDuty")).sendKeys(random.getPost_station());Thread.sleep(500); 
		((JavascriptExecutor)Main.driver).executeScript("arguments[0].scrollIntoView(true);",Main.driver.findElement(By.id("userPhoneNo")));
		Main.driver.findElement(By.id("userPhoneNo")).clear();Thread.sleep(500); 
		Main.driver.findElement(By.id("userPhoneNo")).sendKeys(random.getTel());Thread.sleep(500); 
		Main.driver.findElement(By.id("userEmail")).clear();Thread.sleep(500); 
		Main.driver.findElement(By.id("userEmail")).sendKeys(random.getEmail(1, 9));Thread.sleep(500); 
		Main.driver.findElement(By.id("saveNewInfoBtn")).click();Thread.sleep(500); 
		System.out.println("������Ϣ�޸���ɣ���");
		Thread.sleep(2000); 
		 
		Main.driver.navigate().refresh();// ˢ��ҳ��
	}
	
	public void homepage_img() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeImg-head")));
		Thread.sleep(500); 
		WebElement iframe0 = Main.driver.findElement(By.xpath("//*[@name=\"iframe0\"]"));
		Main.driver.switchTo().frame(iframe0);Thread.sleep(500); //��λ��ҳ��frame��ܲ��л�
		Main.driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]")).click();
		Thread.sleep(500); 
		Main.driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]")).click();
		Thread.sleep(500); 
		
		

		
		Thread.sleep(500); 
		System.out.println("��ҳͼ����������ɣ���");	
		
	}
	


		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	}

}
