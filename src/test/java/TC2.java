import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("this will execute before class methods");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this will execute after class methods");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this will execute before every test");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this will execute after every test");
    }

    @Test
    void test3(){
        System.out.println("This is test3");
    }

    @Test
    void test4(){
        System.out.println("This is test4");
    }
}
