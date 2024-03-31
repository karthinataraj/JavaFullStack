import java.util.Scanner;

public class NumberNamesGame {
    private static final String[] NUMBERNAMES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();
        print(number);
    }

    public static void print(String number) {
        for (int i = 0; i < number.length(); i++) {
            int value = Character.getNumericValue(number.charAt(i));
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(NUMBERNAMES[value]);
        }
    }
}

OUTPUT:

Enter the number: 58723
  
five eight seven two three
  

  
Enter the number: 20
  
two zero





  
