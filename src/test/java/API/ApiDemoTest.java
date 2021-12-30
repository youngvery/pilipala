package API;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiDemoTest {
    @DataProvider(name = "testData")
    public Object[][] data(){
        return new Object[][]{
                {"{\"name\":\"loginname1\",\"pwd\":\"paswd1\"}","application/json",200},
                {"{\"name\":\"loginname2\",\"pwd\":\"paswd2\"}","application/json",200},
                {"{\"name\":\"loginname3\",\"pwd\":\"paswd3\"}","application/json",200}
        };
    }

    @Test(dataProvider = "testData")
    public void ApiTest(String loginname,String type,int statusCode){
        Response response = given().body(loginname).contentType(type).header("x-auth-token", "e3c009ff9a39b46").post("http://www.baidu.com");
        Assert.assertEquals(response.statusCode(),statusCode);//预期值写后面
    }
}
