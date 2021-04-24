package mytesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyTesting {
    void Login() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Login";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("user")).sendKeys("Hari Prasadh");
        driver.findElement(By.id("pwd")).sendKeys("imtheadmin!");
        Thread.sleep(3000);
        driver.findElement ((By.id ("login"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
    
    void StockHome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Stock/Home.jsp?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement ((By.id ("insertstock"))).click ();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("White");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        driver.findElement(By.id("fcost")).sendKeys("250");
        driver.findElement(By.id("fweight")).sendKeys("80");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("removestock"))).click ();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("Gray");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        Thread.sleep(3000);
        driver.findElement ((By.id ("removefabric"))).click ();       
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchstock"))).click ();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("Gray");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.close();
    }
    
     void addFabric() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Stock/Insert.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("White");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        driver.findElement(By.id("fcost")).sendKeys("250");
        driver.findElement(By.id("fweight")).sendKeys("80");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
     
     
    void removeFabric() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Stock/Delete.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("Gray");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        Thread.sleep(3000);
        driver.findElement ((By.id ("removefabric"))).click ();       
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
    void searchFabric() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Stock/Search.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("ftype")).sendKeys("Airtex");
        driver.findElement(By.id("fcolor")).sendKeys("White");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
     
    void BillsHome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/Home.jsp?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement ((By.id ("salesinsert"))).click ();
        Thread.sleep(3000);
        driver.findElement(By.id("scname")).sendKeys("HARRIS");
        driver.findElement(By.id("sbillno")).sendKeys("1006");
        driver.findElement(By.id("sweight")).sendKeys("70");
        driver.findElement(By.id("samount")).sendKeys("10000");
        driver.findElement(By.id("sday")).sendKeys("20");
        driver.findElement(By.id("smonth")).sendKeys("JAN");
        driver.findElement(By.id("syear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addsalesbill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("purchaseinsert"))).click ();
        Thread.sleep(3000);
        driver.findElement(By.id("pcname")).sendKeys("ULLAS");
        driver.findElement(By.id("pbillno")).sendKeys("2008");
        driver.findElement(By.id("pweight")).sendKeys("40");
        driver.findElement(By.id("pamount")).sendKeys("2500");
        driver.findElement(By.id("pday")).sendKeys("28");
        driver.findElement(By.id("pmonth")).sendKeys("FEB");
        driver.findElement(By.id("pyear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addpurchasebill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id("searchbillno"))).click();
        Thread.sleep(3000);
        driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sbillno")).sendKeys("1021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchbillno"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id("searchviadate"))).click();
        Thread.sleep(3000);
         driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sday")).sendKeys("9");
        driver.findElement(By.id("smonth")).sendKeys("JAN");
        driver.findElement(By.id("syear")).sendKeys("2020");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchviadate"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
     void addSalesBill()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/SalesInsert.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("scname")).sendKeys("King Makers");
        driver.findElement(By.id("sbillno")).sendKeys("1025");
        driver.findElement(By.id("sweight")).sendKeys("120");
        driver.findElement(By.id("samount")).sendKeys("10000");
        driver.findElement(By.id("sday")).sendKeys("23");
        driver.findElement(By.id("smonth")).sendKeys("JAN");
        driver.findElement(By.id("syear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addsalesbill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
      void addPurchaseBill()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/PurchaseInsert.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("scname")).sendKeys("Kannan Ltd");
        driver.findElement(By.id("sbillno")).sendKeys("2029");
        driver.findElement(By.id("sweight")).sendKeys("60");
        driver.findElement(By.id("samount")).sendKeys("7000");
        driver.findElement(By.id("sday")).sendKeys("25");
        driver.findElement(By.id("smonth")).sendKeys("JAN");
        driver.findElement(By.id("syear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addpurchasebill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
       void searchBillno()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/SearchBillno.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sbillno")).sendKeys("1014");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchbillno"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
       
       void searchViaDate()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/SearchViaDate.html?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sday")).sendKeys("9");
        driver.findElement(By.id("smonth")).sendKeys("JAN");
        driver.findElement(By.id("syear")).sendKeys("2020");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchviadate"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
       
       
    public static void main(String[] args) throws InterruptedException{
        MyTesting m=new MyTesting();
       // m.addFabric();
       // m.removeFabric();
          m.searchFabric();
       // m.Login();
       // m.StockHome();
       // m.BillsHome();
       // m.addPurchaseBill();
       // m.addSalesBill();
       // m.searchBillno();
       // m.searchViaDate();
    }
}