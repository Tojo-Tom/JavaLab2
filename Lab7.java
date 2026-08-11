public class Lab7 {
    static class Demo {
        Demo() {
            System.out.println("Object Created");
        }

        @SuppressWarnings("deprecation")
        protected void finalize() {
            System.out.println("finalize() method called");
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;
        System.gc();
    }
}