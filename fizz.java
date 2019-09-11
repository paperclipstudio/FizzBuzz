public class fizz {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int i = 0;
        while (i < 420 /* BlAzE It */) {
            i++;
            try {
                Thread.sleep(1000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("Fizz Buzz!");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);        
        }
    }
}