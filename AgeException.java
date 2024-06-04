package JavaBasics;

public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int age = -5; // or any other age input
            if (age <= 0) {
                throw new AgeException("Age cannot be zero or negative.");
            }
            System.out.println("Age is: " + age);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
