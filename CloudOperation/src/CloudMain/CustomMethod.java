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
	
	//1���ж�һ��Ԫ���Ƿ����
//eg: isElementExist(By.id("saveNewInfoBtn"))
	public boolean isElementExist(By by){
	try {
		Main.driver.findElement(by);
		return true;
	} catch (NoSuchElementException e) {
	    return false;
	}
	}

	//2������Ԫ��

	public WebElement findById(String id){
	WebElement element = null;
	if(this.isElementExist(By.id(id))){
	element = Main.driver.findElement(By.id(id));
	}
	return element;
	}

	//3���ж�Ԫ���б��Ƿ����

	public boolean elementsExists(By by){
	return (Main.driver.findElements(by).size()>0)?true:false;
	}

	//4����ȡԪ���б���ָ����Ԫ��

	public WebElement FindByElements(By by,int index){
	WebElement element = null;
	if(this.elementsExists(by)){
	element = Main.driver.findElements(by).get(index);
	}
	return element;
	}
	//5. MD5 ��32λСд�������
		public String MD5(String s) {
			MD5Utils obj = new MD5Utils();
			String x = obj.MD5(s).toLowerCase();
			return x;
		}

	//6. �����ƶ���Χ�ڵ������
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






  

