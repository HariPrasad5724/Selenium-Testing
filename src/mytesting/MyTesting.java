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
        driver.findElement(By.id("user")).sendKeys("hariprasad572415@gmail.com");
        driver.findElement(By.id("pwd")).sendKeys("admin123");
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
        driver.findElement(By.id("ftype")).sendKeys("AIRTEX");
        driver.findElement(By.id("fcolor")).sendKeys("VIOLET");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        driver.findElement(By.id("fcost")).sendKeys("260");
        driver.findElement(By.id("fweight")).sendKeys("80");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("removestock"))).click ();
        driver.findElement(By.id("ftype")).sendKeys("AIRTEX");
        driver.findElement(By.id("fcolor")).sendKeys("LEMON");
        driver.findElement(By.id("fgsm")).sendKeys("250");
        Thread.sleep(3000);
        driver.findElement ((By.id ("removefabric"))).click ();       
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchstock"))).click ();
        driver.findElement(By.id("ftype")).sendKeys("AIRTEX");
        driver.findElement(By.id("fcolor")).sendKeys("VIOLET");
        driver.findElement(By.id("fgsm")).sendKeys("200");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchfabric"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.close();
    }
    
    void BillsHome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Bill/Home.jsp?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement ((By.id ("salesinsert"))).click ();
        Thread.sleep(3000);
        driver.findElement(By.id("scname")).sendKeys("VIJAY");
        driver.findElement(By.id("sbillno")).sendKeys("1026");
        driver.findElement(By.id("sweight")).sendKeys("80");
        driver.findElement(By.id("samount")).sendKeys("8000");
        driver.findElement(By.id("sday")).sendKeys("29");
        driver.findElement(By.id("smonth")).sendKeys("APR");
        driver.findElement(By.id("syear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addsalesbill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("purchaseinsert"))).click ();
        Thread.sleep(3000);
        driver.findElement(By.id("pcname")).sendKeys("AJITH");
        driver.findElement(By.id("pbillno")).sendKeys("2028");
        driver.findElement(By.id("pweight")).sendKeys("70");
        driver.findElement(By.id("pamount")).sendKeys("7000");
        driver.findElement(By.id("pday")).sendKeys("22");
        driver.findElement(By.id("pmonth")).sendKeys("APR");
        driver.findElement(By.id("pyear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("addpurchasebill"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id("searchbillno"))).click();
        Thread.sleep(3000);
        driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sbillno")).sendKeys("1024");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchbillno"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement((By.id("searchviadate"))).click();
        Thread.sleep(3000);
        driver.findElement(By.id("stype")).sendKeys("sales");
        driver.findElement(By.id("sday")).sendKeys("21");
        driver.findElement(By.id("smonth")).sendKeys("APR");
        driver.findElement(By.id("syear")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("searchviadate"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
    }
    void AccountsHome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://localhost:9999/Stock%20Maintenance/servlets/Accounts/Home.jsp?";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement ((By.id ("monthlyprofit"))).click ();
        Thread.sleep(3000);
        driver.findElement(By.id("a_month")).sendKeys("APR");
        driver.findElement(By.id("a_year")).sendKeys("2021");
        Thread.sleep(3000);
        driver.findElement ((By.id ("monthprofit"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("profitcheck"))).click ();
        Thread.sleep(3000);
        driver.findElement ((By.id ("home"))).click ();
        Thread.sleep(3000);
        driver.quit();
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
        // m.searchFabric();
        // m.addPurchaseBill();
        // m.addSalesBill();
        // m.searchBillno();
        // m.searchViaDate();
         //m.Login();
         //m.StockHome();
         //m.BillsHome();
        // m.AccountsHome();
    }
}