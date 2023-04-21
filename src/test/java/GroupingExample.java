import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    public void test1() {
        System.out.println("Test1");
    }

    @Test(groups = {"regression"})
    void test2() {
        System.out.println("Test2");

    }

    @Test(groups = {"smoke","sanity"})
    void test3(){
        System.out.println("Test3");
    }

}

/*
<suite name="All Test Suite">
    <test name = "GroupingTest">
        <groups>
            <run>
                <include name ="sanity"/>
            </run>
        </groups>
        <classes>
            <class name ="GroupingExample"/>
        </classes>
    </test>
</suite>
 */

/*
<suite name="All Test Suite">
    <test name = "GroupingTest">
        <groups>
            <run>
                <exclude name ="sanity"/>
            </run>
        </groups>
        <classes>
            <class name ="GroupingExample"/>
        </classes>
    </test>
</suite>
 */