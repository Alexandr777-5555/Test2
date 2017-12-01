
package drivers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Driver -эмулирует работу робота гугл хром
 * @author 777
 */
public class Driver {
    
  
    /**
     * метод actionDriver() создает экземпляр драйвера 
     * 
     * @return интерфейс веб драйвера
     */

     public static WebDriver actionDriver(){
         
          WebDriver driver=new ChromeDriver();
          
          driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         
         return driver;
     }
     
     


    
    
     
     
     
    }
