
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *����� AccountMessages �������� ��������������� ������������ �� ������� ���� ��
 * 
 * 
 * 
 * @author 777
 */
public class AccountMessagesPageMailRu {
    
   
private final String byNewMessage="b-toolbar__left"; // ������� ������ ��������� ������ ������

    
    /**
     * 
     * 
     * @param driver ��������� ��� ��������
     */
    
    public void buttonClickNewMessage(WebDriver driver){
        
        
           driver.findElement(By.id(byNewMessage)).click();
        
        
    }
    
    
}
