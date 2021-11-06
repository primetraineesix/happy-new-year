package automationtest;

import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
public class ForLoop_Q4 {

    public void printMyName(int homeManyTime, String name) {
        for (int i = 1; i <= homeManyTime; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String myName = scanner.nextLine();
        System.out.println("How many time you want to print your name : ");
        int howManyTime = scanner.nextInt();
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName(howManyTime, myName);
    }
}
