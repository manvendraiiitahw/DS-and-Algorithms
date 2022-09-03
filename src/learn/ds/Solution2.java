package learn.ds;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution2 {

    public static int highestProductOf3(int[] intArray) throws Exception {

        // calculate the highest product of three numbers
        if(intArray.length < 3){
            throw new Exception();
        }else{
            int firstNum=Integer.MIN_VALUE,secondNum=Integer.MIN_VALUE,thirdNum=Integer.MIN_VALUE;
            for (int value : intArray) {
                if (value > firstNum) {
                    thirdNum = secondNum;
                    secondNum = firstNum;
                    firstNum = value;
                } else if (value > secondNum) {
                    thirdNum = secondNum;
                    secondNum = value;
                } else if(value>thirdNum){
                    thirdNum = value;
                }
            }
            return firstNum*secondNum*thirdNum;
        }
    }



    // tests

    @Test
    public void shortArrayTest() throws Exception{
        final int actual = highestProductOf3(new int[] {1, 2, 3, 4});
        final int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void longerArrayTest()throws Exception {
        final int actual = highestProductOf3(new int[] {6, 1, 3, 5, 7, 8, 2});
        final int expected = 336;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasOneNegativeTest() throws Exception{
        final int actual = highestProductOf3(new int[] {-5, 4, 8, 2, 3});
        final int expected = 96;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasTwoNegativesTest()throws Exception {
        final int actual = highestProductOf3(new int[] {-10, 1, 3, 2, -10});
        final int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayIsAllNegativesTest() throws Exception{
        final int actual = highestProductOf3(new int[] {-5, -1, -3, -2});
        final int expected = -6;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void exceptionWithEmptyArrayTest() throws Exception{
        highestProductOf3(new int[] {});
    }

    @Test(expected = Exception.class)
    public void exceptionWithOneNumberTest() throws Exception{
        highestProductOf3(new int[] {1});
    }

    @Test(expected = Exception.class)
    public void exceptionWithTwoNumbersTest() throws Exception{
        highestProductOf3(new int[] {1, 1});
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution2.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}