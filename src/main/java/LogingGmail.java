import org.apache.batik.css.engine.sac.CSSSelectorFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import java.io.IOException;

public class LogingGmail {
    @FindBy(xpath="//input[@type='email']") private WebElement id;
 //  @FindBy(css="div.VfPpkd-RLmnJb") private WebElement next1;
    @FindBy(xpath="//span[text()='Next']") private WebElement next1;
    @FindBy(xpath="//input[@name='password']") private WebElement password;
    @FindBy(xpath="//span[text()='Next']") private WebElement next2;
    public LogingGmail(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void Login() throws InvalidFormatException, IOException, InterruptedException
    {   Thread.sleep(3000);
    	id.sendKeys(UtilityClass.getTD(0, 0));
        Thread.sleep(3000);
    	next1.click();
        Thread.sleep(3000);
    	password.sendKeys(UtilityClass.getTD(0,1));
    	Thread.sleep(3000);
    	next2.click();
        Thread.sleep(3000);

    }
 

}
