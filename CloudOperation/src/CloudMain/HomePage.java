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
		
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);//显示等待100秒
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeImg-head")));
		Thread.sleep(500); 
		Main.driver.findElement(By.id("homeImg-head")).click();//点击头像图标
		Thread.sleep(500); 
		WebElement iframe37 = Main.driver.findElement(By.xpath("//*[@name=\"iframe37\"]"));
		Main.driver.switchTo().frame(iframe37);Thread.sleep(500); //定位frame框架并切换
		Main.driver.findElement(By.id("editInfoBtn"));//查找到“修改个人信息”按钮
		
		for(int i=1;i<=10;i++) {
			((JavascriptExecutor)Main.driver).executeScript("arguments[0].scrollIntoView(true);",Main.driver.findElement(By.id("editInfoBtn")));//向下移动滚动条直到指定元素可见为止
			Thread.sleep(500); 	
			Main.driver.findElement(By.id("editInfoBtn")).click();Thread.sleep(500); 			
			String s = LoadJQueryLib.getInstance().getJs_str(Main.driver, "return $('#userDuty').attr('disabled')");
			if(s==null) {System.out.println("成功进入修改页面！");break;}  //通过加载jQuery类库运行js语句取出目标标签的属性值disabled，作为循环结束条件				
		}
		
		Main.driver.findElement(By.id("img-head")).click();Thread.sleep(500); 
/***上传头像，引用Autolt工具***/		
		Runtime exe = Runtime.getRuntime();
        // Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行。
        try {
            String str = "C:\\Users\\admin\\Documents\\666.exe";
            exe.exec(str);
            // 运行指定位置的.exe文件
        } catch (IOException e) {
            System.out.println("Error to run the exe");
            e.printStackTrace();
        }
        System.out.println("头像已上传完成！！");
	
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
		System.out.println("个人信息修改完成！！");
		Thread.sleep(2000); 
		 
		Main.driver.navigate().refresh();// 刷新页面
	}
	
	public void homepage_img() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Main.driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeImg-head")));
		Thread.sleep(500); 
		WebElement iframe0 = Main.driver.findElement(By.xpath("//*[@name=\"iframe0\"]"));
		Main.driver.switchTo().frame(iframe0);Thread.sleep(500); //定位首页的frame框架并切换
		Main.driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]")).click();
		Thread.sleep(500); 
		Main.driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]")).click();
		Thread.sleep(500); 
		
		

		
		Thread.sleep(500); 
		System.out.println("首页图标点击测试完成！！");	
		
	}
	


		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	}

}
