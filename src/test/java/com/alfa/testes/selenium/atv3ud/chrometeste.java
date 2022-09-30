package com.alfa.testes.selenium.atv3ud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class chrometeste {
	
	static WebDriver driver;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
			System.setProperty("webdriver.chrome.driver", "/home/alphinha/Downloads/chromedriver");
			
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	/*
	//Testando de forma padrão a calculadora.
	@Test
	void test1() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("2");
		driver.findElement(By.id("cx31_1")).sendKeys("5");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("32", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando se a calculadora aceita um expoente negativo
	@Test
	void test2() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("2");
		driver.findElement(By.id("cx31_1")).sendKeys("-2");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("0,25", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	/*
	//Testando se a calculadora aceita uma base negativa.
	@Test
	void test3() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("-2");
		driver.findElement(By.id("cx31_1")).sendKeys("2");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("-4", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando se a base aceita uma letra.
	@Test
	void test4() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("x");
		driver.findElement(By.id("cx31_1")).sendKeys("2");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("?", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando se o expoente aceita uma letra.
	@Test
	void test5() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("2");
		driver.findElement(By.id("cx31_1")).sendKeys("y");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("32", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando propriedade exponencial, base = 0.
	@Test
	void test6() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("0");
		driver.findElement(By.id("cx31_1")).sendKeys("5");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("0", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando propriedade exponencial, expoente = 0.
	@Test
	void test7() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("2");
		driver.findElement(By.id("cx31_1")).sendKeys("0");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("1", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
	*/
	
	/*
	//Testando ambos valores negativos.
	@Test
	void test8() {
		driver.get("http://www.calculadoraonline.com.br/basica");
		driver.findElement(By.id("b31")).click();
		driver.findElement(By.id("cx31_0")).sendKeys("-2");
		driver.findElement(By.id("cx31_1")).sendKeys("-2");
		driver.findElement(By.cssSelector("button.uk-button.uk-button-default")).click();
		assertEquals("-0,25", driver.findElement(By.id("TIExp")).getAttribute("value"));
		
	}
*/

}
