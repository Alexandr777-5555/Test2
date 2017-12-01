
package mail.ru;

import drivers.Driver;
import pages.SendMessagePageMailRu;
import pages.HomePageMailRu;
import pages.AccountMessagesPageMailRu;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author 777
 */
public class MailRuTest {

   

    String login = "testlogin"; //в строку login - имя пользователя для входа в систему

    String password = "testpassword"; //в строку  password пароль пользователя для входа в систему

    String url = "https://mail.ru ";  //в строку  url сайта 
    
    
    // создаем объекты 
    
    WebDriver driver = Driver.actionDriver();
    
    HomePageMailRu mailRu = new HomePageMailRu(login, password, url);  // домашняя страница сервиса майл ру

    AccountMessagesPageMailRu messages = new AccountMessagesPageMailRu(); // страница авторизованного пользователя майл ру

    SendMessagePageMailRu sendMessage = new SendMessagePageMailRu(); // страница отправки письма сервиса майл ру

    @Test
    public void test() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        mailRu.homepage(driver); // переходим на страницу майл ру     

        mailRu.findElementLogin(driver);  // вводим имя пользователя

        mailRu.findElementPassword(driver); // вводим пароль

        mailRu.pressEnterInAccount(driver); // нажимаем клавишу войти в аккаунт        

        messages.buttonClickNewMessage(driver); // нажимаем на кнопку создать новое сообщение 

        sendMessage.toSend(driver);      // кому сообщение 
        
        sendMessage.topicMessage(driver); // тема сообщения 

        sendMessage.message(driver);  // тело сообшения 

        sendMessage.sendmes(driver); // нажимаем кнопку отправить    

        assertEquals("Новое письмо - Почта Mail.Ru", driver.getTitle());  // сравниваем заголовок после отправки письма

        // driver.quit();
    }

}
