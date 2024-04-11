package Treeset;
import java.util.TreeSet;
import java.util.Scanner;
public interface UI {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        NumAvg numAvg = new NumAvg();

	        while (true) {
	            System.out.println("1.Add numbers 2.Find Average\n  3.Exit");
	            System.out.println("Enter Your Choice");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter The Number");
	                    int num = scanner.nextInt();
	                    numAvg.addNum(num);
	                    break;
	                case 2:
	                    TreeSet<Integer> numSet = numAvg.getNumSet();
	                    if (numSet.isEmpty()) {
	                        System.out.println("The set is empty");
	                    } else {
	                        double average = numAvg.calAvg();
	                        System.out.println(average);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Thank you");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please Enter a Number between 1 and 3.");
	            }
	        }
	    }
	}
	

