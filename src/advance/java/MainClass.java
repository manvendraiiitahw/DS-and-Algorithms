package advance.java;
interface basicOperation{
    void start();
    void stop(boolean op);
}
class MyMachine implements basicOperation{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop(boolean op) {
        System.out.println("stop");
    }
    public void operation(){
        System.out.println("operarion");
    }
}
abstract class Testt{
    Testt(){
        System.out.println();
    }
    public abstract void root();
}
class Mango extends Testt{
    @Override
    public void root() {
        System.out.println("Mango cons");
    }

    Mango(){
        System.out.println("Mango cons");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Testt t=new Mango();
        t.root();
//        basicOperation bo=new MyMachine();
//        bo.start();
//        bo.stop();
    }
}
