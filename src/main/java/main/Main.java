
package main;

import drivers.Driver;
import pages.SendMessagePageMailRu;
import pages.HomePageMailRu;
import pages.AccountMessagesPageMailRu;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author 777
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        String login="test"; //� ������ login - ��� ������������ ��� ����� � �������
        
        String password="test"; //� ������  password ������ ������������ ��� ����� � �������
        
        String url="https://mail.ru ";  //� ������  url ����� 
        
        
        
        // ������� ������� 
        WebDriver driver = Driver.actionDriver();      
         
        HomePageMailRu mailRu=new HomePageMailRu(login, password, url); 
        
        AccountMessagesPageMailRu messages=new AccountMessagesPageMailRu(); // 
        
        SendMessagePageMailRu sendMessage=new SendMessagePageMailRu();
        
        
        // ��������
         
         
         mailRu.homepage(driver); // ��������� �� �������� ���� �� 
         
         mailRu.findElementLogin(driver);  // ������ ��� ������������
          
         mailRu.findElementPassword(driver); // ������ ������
         
         mailRu.pressEnterInAccount(driver); // �������� ������� ����� � �������
      
         messages.buttonClickNewMessage(driver); // �������� �� ������ ������� ����� ��������� 
         
        
          sendMessage.toSend(driver); // ���� ��������� 
       
          sendMessage.topicMessage(driver); // ���� ��������� 
                  
          sendMessage.message(driver);  // ���� ��������� 
          
          sendMessage.sendmes(driver); // �������� ������ ���������
          
          
        
       
          
       
     //   driver.quit();
        
        
         
         
        
         
                 
         
        
        
    }

 
    
    
    
    
}
