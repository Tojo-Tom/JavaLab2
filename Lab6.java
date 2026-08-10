public class Lab6 {
    static class Demo {
        Demo() {
            System.out.println("Object Created");
        }

        @SuppressWarnings("deprecation")
        protected void finalize() {
            System.out.println("Object Destroyed");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;
        d2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();

        // Give the JVM a moment (not guaranteed, just for demo purposes)
        Thread.sleep(500);
    }
}