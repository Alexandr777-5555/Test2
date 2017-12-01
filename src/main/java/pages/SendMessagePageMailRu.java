
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * Класс SendMessage страница отправки письма из сервиса майл ру
 *
 *
 * @author 777
 */
public class SendMessagePageMailRu {

    private final String ByCssTo = "textarea.js-input.compose__labels__input"; // локатор адресата сообшения 

    private final String email = "a-777-aaa@mail.ru";  // кому адресовано сообщение 

    private final String ByClass = "compose-head__field";   //переменная для ожидания загрузки класса на странице 

    private final String BySubject = "Subject"; // локатор темы сообщения 

    private final String temaMess = "ЭТО ТЕМА"; // тема сообщения 

    private final String ByXpathIFrame = "//iframe[contains(@id,'composeEditor_ifr')]";  // локатор iFrame

    private final String ByIdMessage = "tinymce"; // локатор для сообщения 

    private final String Message = "очень хочу работать!!!"; // сообщение

    private final String ByXpathButton = "//div[3]/div/div[2]/div/div/span"; // локатор кнопки отправки сообшения 

    /**
     *
     * метод toSend находит локатор кому адресовано сообщение, вписывает email
     * переданный в поле
     *
     * @param driver интерфейс веб драйвера
     */
    public void toSend(WebDriver driver) {

        // 3 секунды ждем или пока не загрузится класс compose-head__field на странице 
        long endTime = System.currentTimeMillis() + 3000;

        while (System.currentTimeMillis() < endTime) {

            WebElement result = driver.findElement(By.className(ByClass)); // ждем пока загрузится класс compose-head__field

            driver.findElement(By.cssSelector(ByCssTo)).clear();

            driver.findElement(By.cssSelector(ByCssTo)).sendKeys(email);

            if (result.equals(email)) {

                break;

            }

        }

    }

    // ТЕМА
    /**
     * метод topicMessage находит локатор темы сообщения , вписывает название
     * темы переданное в поле
     *
     *
     * @param driver интерфейс веб драйвера
     */
    public void topicMessage(WebDriver driver) {

        driver.findElement(By.name(BySubject)).sendKeys(temaMess);

    }

    // пишем письмо
    /**
     * метод message находит тело письма вписывает сообщение которое передано
     *
     * в body
     *
     *
     *
     * @param driver интерфейс веб драйвера
     */
    public void message(WebDriver driver) {

        WebElement iFrame = driver.findElement(By.xpath(ByXpathIFrame));

        driver.switchTo().frame(iFrame);  // установим фокус на iframe

        driver.findElement(By.id(ByIdMessage)).sendKeys(Message);

        driver.switchTo().defaultContent();

    }

    /**
     *
     * метод sendmes ищет кнопку отправки сообщения и нажимает button
     *
     * для отправки письма
     *
     * @param driver интерфейс веб драйвера
     */
    public void sendmes(WebDriver driver) {

        driver.findElement(By.xpath(ByXpathButton)).click();

    }

}
