package Main;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectClass.LoginClass2;
import ObjectClass.LogoutClass;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class MainClass {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Desktop\\Test.xls");
		//Workbook wb = Workbook.getWorkbook(fs);
		//Sheet AddressSheet = wb.getSheet("User_Login");
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//LoginClass2 loginobjects = new LoginClass2 (driver);
			//	loginobjects.Login(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
				
		//LogoutClass logout = new LogoutClass(driver);
		//logout.logout();
		
		for(int x =0; x<3; x++) {
		
			LoginClass2 loginobjects = new LoginClass2 (driver);
		loginobjects.Login("abcxyz10@gmail.com","123456789");
		
		LogoutClass logout = new LogoutClass(driver);
		logout.logout();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		}
//Thread.sleep(2000);
		
//driver.get("https://demo.opencart.com/index.php?route=account/login");
		//LoginClass2 loginobjects2 = new LoginClass2 (driver);
		//loginobjects.Login("abcxyz10@gmail.com","123456789");
		
		//LogoutClass logout2 = new LogoutClass(driver);
		//logout.logout();
	
		//driver.close();
		//driver.quit();
	}

}
