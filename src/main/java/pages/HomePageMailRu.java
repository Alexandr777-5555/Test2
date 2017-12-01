
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *����� HomePageMailRu ��������� �������� ���� �� , �� ������� �������� ��� � 
 * ������ ������������, ��� ����� � ������� ������ ���������� ������ "�����"
 * 
 * 
 * 
 * @author 777
 */
public class HomePageMailRu {
 
  private  String login; // ��� ������������
    
  private  String password; // ������ ������������
    
  private   String url;    // ������� �������� 

  private final String byLogin="login";   // ������� ��� ����� ����� 
  
  private final String byPassword="password" ; // ������� ��� ����� ������
  
  private final String  bySubmit="mailbox:submit"; // ������� ��� ������� ����� � �������
  
  /**
   * ����������� �������:
   * 
   * @param login      ��� ������������
   * @param password   ������
   * @param url        �������� �������� 
   * 
   */


        public HomePageMailRu(String login, String password, String url) {
        this.login = login;
        this.password = password;
        this.url = url;
       
        
        
    }
      
      
        /**
         * ����� homepage ��������� �� �������� ����� ���������� � url
         * 
         * @param driver ��������� �����������
         */
      
      
    public void homepage(WebDriver driver){
                
        driver.get(getUrl());
      
    }
      
      
    /**
     *  ����� findElementLogin ������� �� ����� ���� ��� ����� ����� � ������
     *  ��� ������������ ���������� � ���� 
     * 
     * @param driver  ��������� ��� ��������
     */ 
    
      
    public void findElementLogin(WebDriver driver){
        
     
        
       driver.findElement(By.name(byLogin)).sendKeys(getLogin());    
    }
    
    
    /**
     * 
     * ����� findElementPassword ������� �� ����� ���� ��� ����� ������ � ������ 
     * ������ ����������  � ����
     * @param driver  ��������� ��� ��������
     */           
    public void findElementPassword(WebDriver driver){        
          
        driver.findElement(By.name(byPassword)).sendKeys(getPassword());
        
    }
    
    
    /**
     * ����� pressEnterInAccount ������� ������� �� ����� � ������� �� ����
     * 
     * @param driver ��������� ��� ��������
     */
    public void pressEnterInAccount(WebDriver driver){
        
          driver.findElement(By.id(bySubmit)).click();
        
    }
   
    
    // ������� � ������� 
    
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
