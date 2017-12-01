
package drivers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Driver -��������� ������ ������ ���� ����
 * @author 777
 */
public class Driver {
    
  
    /**
     * ����� actionDriver() ������� ��������� �������� 
     * 
     * @return ��������� ��� ��������
     */

     public static WebDriver actionDriver(){
         
          WebDriver driver=new ChromeDriver();
          
          driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         
         return driver;
     }
     
     


    
    
     
     
     
    }
