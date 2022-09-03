package advance.java.leetcode.subscription.backtrack;

public class PowerOfN {
    public static void main(String[] args) {
        PowerOfN powerOfN=new PowerOfN();
        System.out.println(powerOfN.myPow(2.0,-2));
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -(n);
        }
        return myPowHelper(x, n);
    }

    public double myPowHelper(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * myPowHelper(x, n - 1);
    }
}
