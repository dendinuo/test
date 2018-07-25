package CloudMain;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * ������Ҫ����ʵ�ֿ��Լ��ر��ص�Jquery��
 */
public class LoadJQueryLib {
private static LoadJQueryLib jquery = null;
//private String strJqueryMin = "";


public LoadJQueryLib(){

}

public static LoadJQueryLib getInstance() throws IOException {
if (jquery == null) {
jquery = new LoadJQueryLib();
}
return jquery;
}

private String read4jQueryFile() {
String strJqueryMin = "";
File file = null;
InputStream inStream = null;
ByteArrayOutputStream swapStream = null;
try {
file = new File("C:\\Users\\admin\\Desktop\\js\\jquery.js");//����jqurey·��
inStream = new FileInputStream(file);
swapStream = new ByteArrayOutputStream();
byte[] buff = new byte[1024];
int rc = 0;
while ((rc = inStream.read(buff, 0, 10)) > 0) {
	swapStream.write(buff, 0, rc);
}
swapStream.flush();
strJqueryMin = new String(swapStream.toByteArray(), "UTF-8");
inStream.close();
swapStream.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
return strJqueryMin;
}


private void initJQuery(JavascriptExecutor driver) {
if (!jQueryLoaded(driver)) {
System.out.println("jQuery���û�м��ع�,loading...");
String strJqueryMin = this.read4jQueryFile();

driver.executeScript(strJqueryMin);
//driver.executeScript("window.jQuery=jQuery.noConflict();");
	System.out.println("jQuery���success!...");
}else{
	System.out.println("jQuery���loaded!...");
}
}


/**
* �жϵ�ǰҳ���Ƿ������JQuery
* 
* @param driver
* @return
*/
public Boolean jQueryLoaded(JavascriptExecutor driver) {
	Boolean loaded=false;
try {
	loaded = (Boolean) driver.executeScript("if(typeof jQuery==\"undefined\"){return false;}else{return true;}");
} catch (WebDriverException e) {
	loaded = false;
}
	return loaded;
}


/**
* ִ��JS�ű�
* 
* @param driver
* @param script
* @param args
* @return
*/
public Object runJs(WebDriver driver, String jquery_script, Object... args) {
	JavascriptExecutor js = (JavascriptExecutor) driver; //����webdriverִ��js�ű��Ķ���
	initJQuery(js);
	return js.executeScript(jquery_script, args); //ִ��JS�ű���Ĭ�Ϸ���ֵΪnull
}


/***ִ��JS�ű�������ֵΪString�ͣ�
 * �����ڻ�ȡ����
 * @param driver
 * @param jquery_script
 * @return
 */
public  String getJs_str(WebDriver driver, String jquery_script) {
	JavascriptExecutor js = (JavascriptExecutor) driver; //����webdriverִ��js�ű��Ķ���
	initJQuery(js);
	String str = (String)js.executeScript(jquery_script);
	
	return str ;//ִ��JS�ű�������ֵΪString��
}

public String get_return(String jquery_script) {
	String str2 = getJs_str(Main.driver,jquery_script);
	return str2 ;//����ֵΪString�ͣ������ڻ�ȡ����
}

public static void main(String[] args) {
try {
/***	System.setProperty("webdriver.chrome.driver","D:\\webDriver\\chromedriver.exe");	//webdriver����·��
WebDriver driver = new ChromeDriver();
***/

Main.driver.get("C:\\Users\\admin\\Desktop\\js\\index.html");
//LoadJQueryLib.getInstance().runJs(Main.driver, "jQuery('#username').val('����');");

//String current = LoadJQueryLib.getInstance().getJs_str(Main.driver,"return $('#username').attr('data')");
//ִ��JS���ȡ����ֵ
//System.out.println(current);


//driver.quit();
} catch (Exception e) {
e.printStackTrace();
}
}


}