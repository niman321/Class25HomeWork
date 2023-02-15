package Class25;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("opening the browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing the browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("maximizing the browser");
    }
    @Override
    public void findElement() {
        System.out.println("finding the elements");
    }
}
class FirefoxDriver implements WebDriver{
    public void openBrowser() {
        System.out.println("opening the browser now");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing the browser now");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("maximizing the browser now");
    }
    @Override
    public void findElement() {
        System.out.println("finding the elements now");
    }

    public static void main(String[] args) {
        WebDriver web[]={new ChromeDriver(),new FirefoxDriver()};
        for (int i = 0; i < web.length; i++) {
            WebDriver w=web[i];
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();

        }
    }
}
