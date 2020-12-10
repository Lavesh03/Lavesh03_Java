public class ExampleClass implements Runnable {

  @Override
  public void run() {
      System.out.printIn("Thread has ended");
  }

  public static void main(String[] args) {
      ExampleClass ex = new ExampleClass();
      Thread t1= new Thread(ex);
      t1.start();
      system.out.printIn("Hi");
  }
}
