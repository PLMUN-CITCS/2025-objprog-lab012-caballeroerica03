public class MethodDemo {
    
    // Method to greet
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a custom message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Main method
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is a custom message!"); // Calling the printMessage method
    }
}
