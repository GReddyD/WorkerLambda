public class Main {
    public static void main(String[] args) {
      OnTaskDoneListener listenerDone = System.out::println;
      OnTaskErrorListener listenerError = System.out::println;

      Worker worker = new Worker(listenerDone, listenerError);
      worker.start();
    }
}
