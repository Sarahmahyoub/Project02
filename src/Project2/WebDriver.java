package Project2;

public interface WebDriver {

    //Provide Implementation for the diagram below. Then create a test class
    //in which you need to create Objects of ChromeDriver, FirefoxDrive and
    //SafariDriver classes and see which methods available to them.

    void open();
    void close();

     String getTitle();

    }
        interface TakesScreenShot {

            void getScreenShot();
}
   interface RemoteWebDriver extends WebDriver,TakesScreenShot {

       void navigate();

    }

    class SafariDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open browser");
        }

        @Override
        public void close() {
            System.out.println("Close browser");
        }

        @Override
        public String getTitle() {
            String name="Facebook";
            return name;
        }

        @Override
        public void getScreenShot() {

            System.out.println("ScreenShot");
        }

        @Override
        public void navigate() {

            System.out.println("Navigate browser");
        }
    }

    class FireFoxDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open browser");
        }

        @Override
        public void close() {

            System.out.println("Close browser");
        }

        @Override
        public String getTitle() {
            String name="Facebook";
            return name;
        }

        @Override
        public void getScreenShot() {

            System.out.println("ScreenShot");
        }

        @Override
        public void navigate() {

            System.out.println("Navigate browser");
        }
    }
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open browser");
    }
    @Override
    public void close() {

        System.out.println("Close browser");
    }
    @Override
    public String getTitle() {
        String name="Facebook";
        return name;
    }
    @Override
    public void getScreenShot() {

        System.out.println("ScreenShoot");
    }
    @Override
    public void navigate() {

        System.out.println("Navigate browser");
    }
}

    class WebDriverTester{

        public static void main(String[] args) {

            SafariDriver safariDriver=new SafariDriver();
            safariDriver.getScreenShot();
            safariDriver.open();
            safariDriver.close();
            System.out.println(safariDriver.getTitle());
            safariDriver.navigate();

            System.out.println("-------------");

            FireFoxDriver fireFoxDriver=new FireFoxDriver();
            fireFoxDriver.getScreenShot();
            fireFoxDriver.open();
            fireFoxDriver.close();
            System.out.println(fireFoxDriver.getTitle());
            fireFoxDriver.navigate();

            System.out.println("-------------");

            ChromeDriver chromeDriver=new ChromeDriver();
            chromeDriver.getScreenShot();
            chromeDriver.open();
            chromeDriver.close();
            System.out.println(chromeDriver.getTitle());
            chromeDriver.navigate();
        }

    }




