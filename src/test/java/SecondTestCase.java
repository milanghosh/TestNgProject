import org.testng.annotations.Test;

public class SecondTestCase {


    @Test(priority = 1)
    public void setup() {
        System.out.println("This is setup Set");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("searchCustomer test");
    }

    @Test(priority = 2)
    void addCustomer() {
        System.out.println("addCustomer test");
    }

    @Test(priority = 4)
    void teardown(){
        System.out.println("closing browser");
    }


}
