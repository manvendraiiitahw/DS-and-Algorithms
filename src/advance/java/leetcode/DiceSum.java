package advance.java.leetcode;

public class DiceSum {
    final int MOD = 1000000007;
    public static void main(String[] args) {
//        DiceSum diceSum=new DiceSum();
//        int n=4, k=6;
//        for(int i=4;i<=24;i++) {
//            System.out.print(i +"=");
//            System.out.println(diceSum.numRollsToTarget(n, k, i));
//        }
        System.out.println(test1());
    }

    public static String test1(){
        return "{\n"
                + "    byPatient(\n"
                + "        patients: [ {\n"
                + "            patientId: "
                + 1212
                + ",\n"
                + "            storeNbr: "
                + 212
                + "\n"
                + "        }\n"
                + "        ],\n"
                + "        statusCode: []\n"
                + "    )\n"
                + "    {\n"
                + "\n"
                + "        rxNbr\n"
                + "        storeNbr\n"
                + "        patientId\n"
                + "        productMdsFamId\n"
                + "        fillQty\n"
                + "        fillDaysSplyQty\n"
                + "        remainingQty\n"
                + "        rxExpDate\n"
                + "        rxAutoRefillInd\n"
                + "        maintRxInd\n"
                + "        statusCode\n"
                + "        fills {fillDate\n"
                + "        fillOrder{\n"
                + "            statusCode\n"
                + "        }}\n"
                + "\n"
                + "    }}";
    }


    public static String test(){
        return "{\n"
                + "   byRxNbr(\n"
                + "       rxNbrs: [{\n"
                + "           rxNbr: "
                + 1213
                + "\n"
                + "           storeNbr: "
                + 1982
                + "\n"
                + "       }],\n"
                + "       statusCode: []\n"
                + "   )\n"
                + "{\n"
                + "   rxNbr\n"
                + "   storeNbr\n"
                + "   patientId\n"
                + "   productMdsFamId\n"
                + "   fillQty\n"
                + "   fillDaysSplyQty\n"
                + "   remainingQty\n"
                + "   rxExpDate\n"
                + "   statusCode\n"
                + "   lastRxFillId\n"
                + "   rxAutoRefillInd\n"
                + " relatedRxs {\n"
                + " rxId\n"
                + " reltRxId\n"
                + "storeNbr}\n"
                + "   fills{\n"
                + "fillQty\n"
                + "fillDaysSplyQty\n"
                + " rxFillId\n"
                + "   patientDueAmt\n"
                + "   expectedSaleAmt\n"
                + "   statusCode\n"
                + "   fillTypeCode\n"
                + "   thirdPartyInd\n"
                + "   taxAmt\n"
                + "    fillItem {\n"
                + "    storeNbr\n"
                + "    rxFillId\n"
                + "    itemMdsFamId\n"
                + "    usualCostAmt\n"
                + "    actualCostAmt\n"
                + "    fillItemQty\n"
                + "}\n"
                + "   saleDtl{\n"
                + "           txnAmt\n"
                + "   copayAmt\n"
                + "   taxAmt\n"
                + "   }\n"
                + "   fillOrder{  orderId\n"
                + "rxFillId\n"
                + "   orderSeqNbr\n"
                + "   statusCode\n"
                + "   nextWorkQueCode\n"
                + "   estPickupTs\n"
                + "   workQueStatCode\n"
                + "   problems{    phmProblemCode\n"
                + "   problemComment}}\n"
                + "   }\n"
                + "}\n"
                + "}";
    }


    public int numRollsToTarget(int n, int k, int target) {
        int[][] memo = new int[n + 1][target + 1];
        // Intialize the base case
        memo[n][target] = 1;

        for (int diceIndex = n - 1; diceIndex >= 0; diceIndex--) {
            for (int currSum = 0; currSum <= target; currSum++) {
                int ways = 0;

                // Iterate over the possible face value for current dice
                for (int i = 1; i <= Math.min(k, target - currSum); i++) {
                    ways = (ways + memo[diceIndex + 1][currSum + i]) % MOD;
                }

                memo[diceIndex][currSum] = ways;
            }
        }

        return memo[0][0];
    }
}
