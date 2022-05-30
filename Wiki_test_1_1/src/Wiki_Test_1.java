    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Wiki_Test_1 {

    @Test(description = "Validar existencia de palabra 'Bienvenidos'")
		
        public void ValidarExistenciaBienvenidos() 
        throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
		WebElement Bienvenidos = driver.findElement(By.xpath("//a[contains(text(),'Bienvenidos')]"));  
		System.out.println(Bienvenidos.getText());  
		Assert.assertTrue(Bienvenidos.isDisplayed());
		driver.close();
		
	
	}
	}