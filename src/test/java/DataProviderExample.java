import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

//    @DataProvider(name = "LoginData")
//    public Object[][] getData(){
//
//        Object[][] data = {{"abc@gmail.cpom", "abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
//        return data;
//    }

    //if data provider is present is in another class, you have to provide the class
    @Test(dataProvider = "LoginData",dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String password){
        System.out.println(email+" "+ password);
    }

}
