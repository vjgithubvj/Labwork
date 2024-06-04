package JavaBasics;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Trying to access an index that doesn't exist
            
            // ArithmeticException
            int result = 10 / 0; // Trying to divide by zero
            
            // NullPointerException
            String text = null;
            System.out.println(text.length()); // Trying to call a method on a null reference
            
            // NumberFormatException
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr); // Trying to parse a non-numeric string
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught some other Exception: " + e.getMessage());
        }
    }
}
