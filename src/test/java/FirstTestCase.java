import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {


    @Test(priority = 1)
    public void setup() {
        System.out.println("This is setup Set");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("Login test");
//        Assert.fail();
    }

    @Test(priority = 3, enabled = false)
    void teardown(){
        System.out.println("closing browser");
    }


}
/*
1. Setup
2. login
3. Close
 */
// By default testng will run the test in alphabetical order -- that is why we need priority
//TestSuite ---> Test case -->  Test steps
//
//Package ---> Classses ----> Test Methods @Test
