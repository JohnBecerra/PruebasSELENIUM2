package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.Thread;


public class test2 {


    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\John Sebastian\\IdeaProjects\\PruebasSELENIUM2\\src\\main\\chromedriver\\chromedriver.exe");
        //ABRIR PAGINA
        driver.get("https://www.saucedemo.com/v1/");
        //INSTRUCCIONES
        driver.manage().window().maximize();
        //VARIABLES GUARDAR CREDENCIALES
        String usuario = "standard_user";
        String contraseña = "secret_sauce";
        String primernombre = "John";
        String segundonombre = "Becerra";
        String postal = "250251";

        WebElement usuarioentrada = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement contraseñaentrada = driver.findElement(By.id("password"));
        usuarioentrada.sendKeys(usuario);
        contraseñaentrada.sendKeys(contraseña);
        WebElement btningresar = driver.findElement(By.xpath("//input[@id='login-button']"));
        btningresar.click();
        WebElement carritocompra = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));
        carritocompra.click();
        WebElement clickcarro = driver.findElement(By.cssSelector("path"));
        clickcarro.click();
        WebElement checkout = driver.findElement(By.cssSelector(".btn_action"));
        checkout.click();
        WebElement checknamefirst = driver.findElement(By.id("first-name"));
        checknamefirst.sendKeys(primernombre);
        WebElement checknamelast = driver.findElement(By.id("last-name"));
        checknamelast.sendKeys(segundonombre);
        WebElement postalcode = driver.findElement(By.id("postal-code"));
        postalcode.sendKeys(postal);
        postalcode.sendKeys(Keys.ENTER);
        WebElement btnfinish = driver.findElement(By.cssSelector(".btn_action"));
        btnfinish.click();
        try {
            // Realizar el desplazamiento hacia abajo
            jsExecutor.executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000); // Pausa de 1 segundo

            // Realizar el desplazamiento hacia arriba
            jsExecutor.executeScript("window.scrollBy(0, -500);");
            Thread.sleep(2000); // Pausa de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

