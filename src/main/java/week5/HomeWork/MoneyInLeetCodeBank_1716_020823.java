package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MoneyInLeetCodeBank_1716_020823 {

    /*@Test
    public void test1(){
        int n = 4;
        int actual = totalMoney(n);
        int output = 10;
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int n = 8;
        int actual = totalMoney(n);
        int output = 30;
        Assert.assertEquals(actual, output);
    }*/
    @Test
    public void test3(){
        int n = 10;
        int actual = totalMoney(n);
        int output = 37;
        Assert.assertEquals(actual, output);
    }


    public int totalMoney(int n) {

        Calendar cal = new GregorianCalendar();

        int day = 0;
        int amt =0, initial =0;
        int dow=1;

        cal.setFirstDayOfWeek(2);
        day = cal.getFirstDayOfWeek();

        for(int i=1;i<=n;i++){
            if(day ==9){
                cal.setFirstDayOfWeek(2);
                day = cal.getFirstDayOfWeek();
                dow=1;

            }
            if(day != 2){
                dow++;
                amt = amt + day;
            }else{
                initial++;
                amt = initial + amt;
            }
            cal.setFirstDayOfWeek(day++);

        }
        return amt;
    }
}
