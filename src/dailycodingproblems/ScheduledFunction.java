package dailycodingproblems;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 11/2/19
 */

public class ScheduledFunction {
  public static void main(String[] args) throws InterruptedException {
//    scheduledFunction(f(), 1000);
  }

  static void scheduledFunction(Runnable f, int n) throws InterruptedException {
    while (true) {
      f();
      Thread.sleep(1000);
    }
  }

  public static void f() {
    System.out.println("abc");
  }
}
