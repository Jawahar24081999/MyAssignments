package week2.day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;

	public class FacebookLogin {
		public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver driver =  new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.id("email")).sendKeys("jawahar.baskar@gmail.com"); 
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Jawahar");
			driver.findElement(By.name("lastname")).sendKeys("baskaran");
			WebElement element = driver.findElement(By.id("day"));
			Select click = new Select(element);
			click.selectByIndex(24);
			WebElement element2 = driver.findElement(By.id("month"));
			Select choose = new Select(element);
			choose.selectByValue("8");
			WebElement element3 = driver.findElement(By.id("year"));
			Select drop = new Select(element3);
			drop.selectByVisibleText("1999");
			driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
			driver.findElement(By.name("reg_email__")).sendKeys("jawahar.baskar@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("24680@jawahar");
			driver.findElement(By.name("websubmit")).click();
			driver.close();


		

}
}