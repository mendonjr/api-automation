package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

    @Test(dataProvider = "getData")
    public void doLogin(String userName, String passWord) {
        System.out.println(userName+"  "+passWord);
    }

    @DataProvider
    public Object[][] getData(){


        Object[][] data = new Object[2][2];

        data[0][0] = "xyz@wdwd.com";
        data[0][1] = "ola@187yfb";
        data[1][0] = "ajax@antony.com";
        data[1][1] = "string123";

        return data;
    }
}
