import java.util.Scanner;

class NumberPuzzleGame{
    private int number;

    public NumberPuzzleGame(int number) {
        this.number = number;
    }

    public int solve() {
        if (number < 10 || number > 99) {
            System.out.println("It's a Invalid number");
            return -1;
        }

        if (number > 50) {
            int value1 = number / 10;
            int value2 = number % 10;
            return value1 - value2;
        } else {
            int reversedNumber = (number % 10) * 10 + (number / 10);
            int value1 = reversedNumber / 10;
            int value2 = reversedNumber % 10;
            return value1 - value2;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        NumberPuzzleGame puzzle = new NumberPuzzleGame(num);
        int result = puzzle.solve();
        if (result != -1) {
            System.out.println("Result: " + result);
        }
    }
}





OUTPUTS:

Enter the number: 56
Result: -1


Enter the number: 484
Result: 4


Enter the number: 9
It's a Invalid number
