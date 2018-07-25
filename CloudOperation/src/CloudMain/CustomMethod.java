package CloudMain;

import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;  
import java.util.Map;  
import  MD5Utils.MD5Utils;


public class CustomMethod {
	
	//1、判断一个元素是否存在
//eg: isElementExist(By.id("saveNewInfoBtn"))
	public boolean isElementExist(By by){
	try {
		Main.driver.findElement(by);
		return true;
	} catch (NoSuchElementException e) {
	    return false;
	}
	}

	//2、查找元素

	public WebElement findById(String id){
	WebElement element = null;
	if(this.isElementExist(By.id(id))){
	element = Main.driver.findElement(By.id(id));
	}
	return element;
	}

	//3、判断元素列表是否存在

	public boolean elementsExists(By by){
	return (Main.driver.findElements(by).size()>0)?true:false;
	}

	//4、获取元素列表中指定的元素

	public WebElement FindByElements(By by,int index){
	WebElement element = null;
	if(this.elementsExists(by)){
	element = Main.driver.findElements(by).get(index);
	}
	return element;
	}
	//5. MD5 ，32位小写加密输出
		public String MD5(String s) {
			MD5Utils obj = new MD5Utils();
			String x = obj.MD5(s).toLowerCase();
			return x;
		}

	//6. 生成制定范围内的随机数
	public long RandomA(int a,int b) {
		Random random = new Random();
		long max=a;
        long min=b;
        long x ;
        if(a<b) {x=max;max=min;min=x;}
        x = random.nextLong()%(max-min+1) + min;
		return x;
	}
	
	//7. 
	 
	
	
}






  

