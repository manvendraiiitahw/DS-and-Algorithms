package fwd;

public class Test {
    public static void main(String[] args){
        try {
//            System.out.println(1/0);
//            System.exit(0);
//            System.out.println(1/0);
            System.out.println(8 ^ 7);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("testiiiinnnnggg");
        }


    }
}
