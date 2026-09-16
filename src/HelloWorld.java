public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from STAGING environment!");
        System.out.println("Running on Java version: " +
            System.getProperty("java.version"));
    }
}
