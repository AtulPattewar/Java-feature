public class RunnableLamdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("legacy runnable");
            }
        };

        new Thread(runnable).start();


        // Using Lamda runnable interface
        Runnable runnableLamda = () -> {
            System.out.println("runnable Lamda");
        };
        new Thread(runnableLamda).start();


    }
}