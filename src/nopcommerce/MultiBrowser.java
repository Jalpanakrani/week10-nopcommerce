package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Chrome");
        System.out.println("Press 2 for Edge");
        System.out.println("Press 3 for Firefox");

        String baseUrl = "https://demo.nopcommerce.com/";
         int num1 = in.nextInt();
         String baseUrL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        if (num1 ==1){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            // Launch the Url
            driver.get(baseUrl);
            //Maximum window
            driver.manage().window().maximize();
            //we give implicit time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            //get the title of the page
            String title = driver.getTitle();
            System.out.println(title);
            //Get current URl
            System.out.println("Current URL = " +driver.getCurrentUrl());
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);
            System.out.println("Current URL = " +driver.getCurrentUrl());
            //find the email field Element
            WebElement emailField = driver.findElement(By.id("Email"));
            //sending email to email field element
            emailField.sendKeys("prime123@gmail.com");
            //Find the passwordfield element
            WebElement passwordField = driver.findElement(By.name("Password"));
            // Sending password to password field element
            passwordField.sendKeys("Prime123");

            //Close the browser
            driver.close();

        }
        else if (num1 == 2){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            // Launch the URL.
            driver.get(baseUrl);
            // Maximise Window
            driver.manage().window().maximize();
            // We give implicit time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Get the title of the page
            String title = driver.getTitle();
            System.out.println(title);

            //Get urrent URL
            System.out.println("Current URL = " + driver.getCurrentUrl());

            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);

            System.out.println("Current URL = " + driver.getCurrentUrl());

            // Find the email field element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Sending email to email field element
            emailField.sendKeys("prime123@gmail.com");

            // Find the password field element
            WebElement passwordField = driver.findElement(By.name("Password"));
            // Sending Password to password field element
            passwordField.sendKeys("Prime123");

            //Close the browser
            driver.close();

        }
        else if (num1 == 3){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            //launch the Url
            driver.get(baseUrl);
            //Maxmum window
            driver.manage().window().maximize();
            //We give implict time time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            // Get the title of the page
            String title = driver.getTitle();
            System.out.println(title);
            // Get current Url
            System.out.println("Current URL = " +driver.getCurrentUrl());
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);
            System.out.println("Current URL = " +driver.getCurrentUrl());
            // find the email field element
            WebElement emailField = driver.findElement(By.id("Email"));
           // sending email to email field element
            emailField.sendKeys("prime123@gmail.com");
            // Find the password field element
            WebElement passwordField = driver.findElement(By.name("Password"));
            // Sending Password to password field element
            passwordField.sendKeys("Prime123");

            //Close the browser
            driver.close();
        }
        else {
            System.out.println("Invalid Selction");
        }


    }
}
