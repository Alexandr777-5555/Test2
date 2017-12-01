
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
        
        
        String login="test"; //в строку login - имя пользователя для входа в систему
        
        String password="test"; //в строку  password пароль пользователя для входа в систему
        
        String url="https://mail.ru ";  //в строку  url сайта 
        
        
        
        // создаем объекты 
        WebDriver driver = Driver.actionDriver();      
         
        HomePageMailRu mailRu=new HomePageMailRu(login, password, url); 
        
        AccountMessagesPageMailRu messages=new AccountMessagesPageMailRu(); // 
        
        SendMessagePageMailRu sendMessage=new SendMessagePageMailRu();
        
        
        // действия
         
         
         mailRu.homepage(driver); // переходим на страницу майл ру 
         
         mailRu.findElementLogin(driver);  // вводим имя пользователя
          
         mailRu.findElementPassword(driver); // вводим пароль
         
         mailRu.pressEnterInAccount(driver); // нажимаем клавишу войти в аккаунт
      
         messages.buttonClickNewMessage(driver); // нажимаем на кнопку создать новое сообщение 
         
        
          sendMessage.toSend(driver); // кому сообщение 
       
          sendMessage.topicMessage(driver); // тема сообщения 
                  
          sendMessage.message(driver);  // тело сообшения 
          
          sendMessage.sendmes(driver); // нажимаем кнопку отправить
          
          
        
       
          
       
     //   driver.quit();
        
        
         
         
        
         
                 
         
        
        
    }

 
    
    
    
    
}
