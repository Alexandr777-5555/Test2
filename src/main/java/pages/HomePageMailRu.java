
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *класс HomePageMailRu Домашнаяя страница майл ру , на которой вводится имя и 
 * пароль пользователя, для входа в учетную запись нажимается кнопка "ВОЙТИ"
 * 
 * 
 * 
 * @author 777
 */
public class HomePageMailRu {
 
  private  String login; // имя пользователя
    
  private  String password; // пароль пользователя
    
  private   String url;    // главная страница 

  private final String byLogin="login";   // локатор для ввода имени 
  
  private final String byPassword="password" ; // локатор для ввода пароля
  
  private final String  bySubmit="mailbox:submit"; // локатор для нажатия входа в аккаунт
  
  /**
   * Конструктор объекта:
   * 
   * @param login      имя пользователя
   * @param password   пароль
   * @param url        страница перехода 
   * 
   */


        public HomePageMailRu(String login, String password, String url) {
        this.login = login;
        this.password = password;
        this.url = url;
       
        
        
    }
      
      
        /**
         * Метод homepage переходит на страницу сайта полученную в url
         * 
         * @param driver интерфейс вебдрайвера
         */
      
      
    public void homepage(WebDriver driver){
                
        driver.get(getUrl());
      
    }
      
      
    /**
     *  Метод findElementLogin находит по имени поле для ввода имени и вводит
     *  имя пользователя переданное в поле 
     * 
     * @param driver  интерфейс веб драйвера
     */ 
    
      
    public void findElementLogin(WebDriver driver){
        
     
        
       driver.findElement(By.name(byLogin)).sendKeys(getLogin());    
    }
    
    
    /**
     * 
     * Метод findElementPassword находит по имени поле для ввода пароля и вводит 
     * пароль переданный  в поле
     * @param driver  интерфейс веб драйвера
     */           
    public void findElementPassword(WebDriver driver){        
          
        driver.findElement(By.name(byPassword)).sendKeys(getPassword());
        
    }
    
    
    /**
     * Метод pressEnterInAccount находит элемент по имени и кликает по нему
     * 
     * @param driver интерфейс веб драйвера
     */
    public void pressEnterInAccount(WebDriver driver){
        
          driver.findElement(By.id(bySubmit)).click();
        
    }
   
    
    // сеттеры и геттеры 
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
      
}
