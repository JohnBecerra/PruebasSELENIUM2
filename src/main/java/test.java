import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class test {
    private static WebDriver driver;
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\John Sebastian\\IdeaProjects\\PruebasSELENIUM2\\src\\main\\chromedriver\\chromedriver.exe");
        //ARRANCAR EL NAVEGADOR
        driver = new ChromeDriver();
        //ABRIR PAGINA
        driver.get("https://mvnrepository.com/search?q=SELENIUM");
        //INSTRUCCIONES
        driver.manage().window().maximize();
    }
}
