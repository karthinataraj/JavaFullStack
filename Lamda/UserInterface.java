package Lamda;

public class UserInterface {


    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        NumberCategory amiChecker = NumberCategoryUtility.checkAmicable();
        boolean areAmicable = amiChecker.checkNumberCategory(num1, num2);
        
        NumberCategory palindromeChecker = NumberCategoryUtility.checkPalindrome();
        boolean isPalindrome = palindromeChecker.checkNumberCategory(num1, num2);
        
        if (areAmicable) {
            System.out.println(num1 + " and " + num2 + " are the Amicable Numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Amicable Numbers");
        }
        
        if (isPalindrome) {
            System.out.println("Their Product " + num1 * num2 + " does produce a Palindrome");
        } else {
            System.out.println("Their Product " + num1 * num2 + " does not produce a Palindrome");
        }
    }
}
