import java.util.Scanner;

public class GetArraySizeFromUser {

    public static int getArraySizeFromUser() {

        Scanner getArraySizeFromUserScan = new Scanner(System.in);

        int enteredArraySize = 0;

        boolean isEnteringCorrect = false;

        while (!isEnteringCorrect) {

            System.out.println("This program needs to create an array.\nThe size of the array " +
                    "must be a positive number.");
            System.out.print("Enter the size of the array [ 1 .. 2 147 483 647 ] = ");

            enteredArraySize = getArraySizeFromUserScan.nextInt();

            if (enteredArraySize > 0) {
                System.out.println("The entered value is correct!");
                isEnteringCorrect = true;
            } else {
                System.out.println("The entered value is incorrect!");
            }
        }

        getArraySizeFromUserScan.close();
        return enteredArraySize;

    }

    public static void main(String[] args) {
        System.out.printf("Entered number is: %d", getArraySizeFromUser());
    }

}


