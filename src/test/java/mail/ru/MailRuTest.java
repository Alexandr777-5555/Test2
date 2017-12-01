
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

   

    String login = "testlogin"; //� ������ login - ��� ������������ ��� ����� � �������

    String password = "testpassword"; //� ������  password ������ ������������ ��� ����� � �������

    String url = "https://mail.ru ";  //� ������  url ����� 
    
    
    // ������� ������� 
    
    WebDriver driver = Driver.actionDriver();
    
    HomePageMailRu mailRu = new HomePageMailRu(login, password, url);  // �������� �������� ������� ���� ��

    AccountMessagesPageMailRu messages = new AccountMessagesPageMailRu(); // �������� ��������������� ������������ ���� ��

    SendMessagePageMailRu sendMessage = new SendMessagePageMailRu(); // �������� �������� ������ ������� ���� ��

    @Test
    public void test() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        mailRu.homepage(driver); // ��������� �� �������� ���� ��     

        mailRu.findElementLogin(driver);  // ������ ��� ������������

        mailRu.findElementPassword(driver); // ������ ������

        mailRu.pressEnterInAccount(driver); // �������� ������� ����� � �������        

        messages.buttonClickNewMessage(driver); // �������� �� ������ ������� ����� ��������� 

        sendMessage.toSend(driver);      // ���� ��������� 
        
        sendMessage.topicMessage(driver); // ���� ��������� 

        sendMessage.message(driver);  // ���� ��������� 

        sendMessage.sendmes(driver); // �������� ������ ���������    

        assertEquals("����� ������ - ����� Mail.Ru", driver.getTitle());  // ���������� ��������� ����� �������� ������

        // driver.quit();
    }

}
