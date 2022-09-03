//public class GrabSolution {
//    public static void main(String[] args){
//        int a=-2396;
//        int i = 0;
//        int[] binaryNum = new int[32];
//        int cur=(int) Math.pow(-2, i);
//        while (a != 0) {
//            // storing remainder in binary array
//            binaryNum[i] = a % (2);
//            a=a/-2;
//            i++;
//        }
////        while (cur <  a) {
////            // storing remainder in binary array
////            int t=a / cur;
////            binaryNum[i] = t % (2);
////            i++;
////            cur=(int) Math.pow(-2, i);
////        }
//        for(int j=0;j< i;j++){
//            System.out.print(binaryNum[j]+" ");
//        }
// //        1 -2 4 -8 16 -32 64 -128 256 -512 1024 -2048 4096 -8192 16384
////         0  1  1  0  0   1   0  1   1   1    0    1    0     1     1
////         0  0  1  0  0   1   1  1   1   1    0    1
////          0+0+4+0-32+64-128+256-512-2048
////         0  1  0  1  1   0   0  0   1   0    1    1    1
////        3334
//    }
//}
//011
//001
//0+-2+4=2
//011111
