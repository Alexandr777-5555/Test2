
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * ����� SendMessage �������� �������� ������ �� ������� ���� ��
 *
 *
 * @author 777
 */
public class SendMessagePageMailRu {

    private final String ByCssTo = "textarea.js-input.compose__labels__input"; // ������� �������� ��������� 

    private final String email = "a-777-aaa@mail.ru";  // ���� ���������� ��������� 

    private final String ByClass = "compose-head__field";   //���������� ��� �������� �������� ������ �� �������� 

    private final String BySubject = "Subject"; // ������� ���� ��������� 

    private final String temaMess = "��� ����"; // ���� ��������� 

    private final String ByXpathIFrame = "//iframe[contains(@id,'composeEditor_ifr')]";  // ������� iFrame

    private final String ByIdMessage = "tinymce"; // ������� ��� ��������� 

    private final String Message = "����� ���� ��������!!!"; // ���������

    private final String ByXpathButton = "//div[3]/div/div[2]/div/div/span"; // ������� ������ �������� ��������� 

    /**
     *
     * ����� toSend ������� ������� ���� ���������� ���������, ��������� email
     * ���������� � ����
     *
     * @param driver ��������� ��� ��������
     */
    public void toSend(WebDriver driver) {

        // 3 ������� ���� ��� ���� �� ���������� ����� compose-head__field �� �������� 
        long endTime = System.currentTimeMillis() + 3000;

        while (System.currentTimeMillis() < endTime) {

            WebElement result = driver.findElement(By.className(ByClass)); // ���� ���� ���������� ����� compose-head__field

            driver.findElement(By.cssSelector(ByCssTo)).clear();

            driver.findElement(By.cssSelector(ByCssTo)).sendKeys(email);

            if (result.equals(email)) {

                break;

            }

        }

    }

    // ����
    /**
     * ����� topicMessage ������� ������� ���� ��������� , ��������� ��������
     * ���� ���������� � ����
     *
     *
     * @param driver ��������� ��� ��������
     */
    public void topicMessage(WebDriver driver) {

        driver.findElement(By.name(BySubject)).sendKeys(temaMess);

    }

    // ����� ������
    /**
     * ����� message ������� ���� ������ ��������� ��������� ������� ��������
     *
     * � body
     *
     *
     *
     * @param driver ��������� ��� ��������
     */
    public void message(WebDriver driver) {

        WebElement iFrame = driver.findElement(By.xpath(ByXpathIFrame));

        driver.switchTo().frame(iFrame);  // ��������� ����� �� iframe

        driver.findElement(By.id(ByIdMessage)).sendKeys(Message);

        driver.switchTo().defaultContent();

    }

    /**
     *
     * ����� sendmes ���� ������ �������� ��������� � �������� button
     *
     * ��� �������� ������
     *
     * @param driver ��������� ��� ��������
     */
    public void sendmes(WebDriver driver) {

        driver.findElement(By.xpath(ByXpathButton)).click();

    }

}
