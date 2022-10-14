package com.ujiandua.tessany;

package com.ujian.tessany;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculationAmount {

    Account account;
    CalculationAmount calculationAmount;

    @BeforeMethod
    public void setUp(){
        account = new Account();
        calculationAmount =new CalculationAmount();
    }


    @Test
    public void testCalculatewithdraw() {
        account.acc_no = 1234444;
        account.name = "tessany";
        account.amount = 10000000;
        account.withdraw(100000);
    }

    @Test
    public void TestInsert(){
        account.acc_no=123444;
        account.name="tessany";
        account.amount=50000;
        account.display();
    }
    @Test
    @Parameters("text")
    public  void testAsserttrue (String text){
        String actual ="Data berhasil disimpan";
        String expect ="Data berhasil disimpan";
        Assert.assertTrue(actual.equals(expect));
    }
}
