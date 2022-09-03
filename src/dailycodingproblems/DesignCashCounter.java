package dailycodingproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class DesignCashCounter {
    enum CurrencyDenomination {
        ONE_HUNDRED(100.00f),
        FIFTY(50.00f),
        TWENTY(20.00f),
        TEN(10.00f),
        FIVE(5.00f),
        TWO(2.00f),
        ONE(1.00f),
        HALF_DOLLAR(0.50f),
        QUARTER(0.25f),
        DIME(0.10f),
        NICKEL(0.05f),
        PENNY(0.01f);

        private final String description;
        private final float value;

        CurrencyDenomination(float value) {
            this.value = value;
            this.description = this.name().replace("_", " ");
        }

        public float getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            if (line.length() < 2) {
                System.out.println("Please pass input in correct format, ex: 10.0;10.0");
                continue;
            }
            String[] fields = line.split(";", 2);
            if (fields.length < 2) {
                System.out.println("Please pass input in correct format, ex: 10.0;10.0");
                continue;
            }
            if(!isValidNumber(fields[0]) || !isValidNumber(fields[1])){
                System.out.println("Please pass input in correct format, ex: 10.0;10.0");
                continue;
            }
            float productPrice = Float.parseFloat(fields[0]);
            float customerGivenCash = Float.parseFloat(fields[1]);
            if (customerGivenCash < productPrice) {
                System.out.println("ERROR");
            }
            if (customerGivenCash == productPrice) {
                System.out.println("ZERO");
            }
            float remaningCustomerCashBack = customerGivenCash - productPrice;

            StringBuilder changeOutput = new StringBuilder();
            List<String> output=new ArrayList<>();
            for (CurrencyDenomination d : CurrencyDenomination.values()) {
                while (remaningCustomerCashBack >= d.getValue()) {
                    remaningCustomerCashBack -= d.getValue();
                    output.add(d.description);
                    changeOutput.append(d).append(',');
                }
            }
            if(remaningCustomerCashBack > 0.0099f){
                output.add(CurrencyDenomination.PENNY.description);
            }
            Collections.sort(output);
            for (String st: output){
                System.out.print(st+" ");
            }
        }
    }

    private static boolean isValidNumber(String input1) {
        try {
            Float.parseFloat(input1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
