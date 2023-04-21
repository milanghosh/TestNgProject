import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "LoginData")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.cpom", "abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }
}
