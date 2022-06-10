package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;


public class Pages {
	WebDriver driver;
	
	public Pages(WebDriver Iddriver) 
	{
		this.driver=Iddriver;
	}
	
	@FindBy(id = "searchInput")
	private WebElement TextoCajaBusqueda;
	
	public void IngresarDatoCajaBusqueda (String dato)
	{
		Reporter.log("Localizar y comprobar que la caja se muestre");
		Assert.assertTrue(TextoCajaBusqueda.isDisplayed(),"La caja de busqueda no se visializa");
		Reporter.log("Ingresar palabra Selenium");
		TextoCajaBusqueda.sendKeys(dato);
		Reporter.log("presionar Enter");
		TextoCajaBusqueda.sendKeys(Keys.ENTER);
	}

}
