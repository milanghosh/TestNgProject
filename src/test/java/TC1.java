import org.testng.annotations.*;

public class TC1 {

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
    void test1(){
        System.out.println("This is test1");
    }

    @Test
    void test2(){
        System.out.println("This is test2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This is beforeTest");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This is afterTest");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This is beforeSuite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This is afterSuite");
    }




}
