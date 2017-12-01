
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *класс AccountMessages страница авторизованного пользователя на сервисе майл ру
 * 
 * 
 * 
 * @author 777
 */
public class AccountMessagesPageMailRu {
    
   
private final String byNewMessage="b-toolbar__left"; // локатор кнопки написания нового письма

    
    /**
     * 
     * 
     * @param driver интерфейс веб драйвера
     */
    
    public void buttonClickNewMessage(WebDriver driver){
        
        
           driver.findElement(By.id(byNewMessage)).click();
        
        
    }
    
    
}
