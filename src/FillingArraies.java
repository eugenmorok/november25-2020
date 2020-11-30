import java.util.Scanner;

public class FillingArraies {

    //--------------------------------------------------------------- from keyboard

    static void fillerOfArrayByUser(int[] inputArray) {

        Scanner sc = new Scanner(System.in);

        int amountOfElements = inputArray.length;

        boolean isUserReady = false;

        while (!isUserReady) {

            System.out.printf("Do you really want to enter %d elements (y/n): ", amountOfElements);
            int userAnswer = sc.nextLine().charAt(0);
            if (userAnswer == 121) {
                isUserReady = true;
            } else break;

        }

        if (isUserReady) {

            int j = 0;

            while (j < amountOfElements) {

                System.out.printf("Enter the %d number of array (int): \n", j + 1);
                inputArray[j] = sc.nextInt();
                j++;

            }

            System.out.println("The array is full");

        }

        System.out.println("The end of the method.");
        sc.close();

    }

    //-------------------------------------------------- constant

    static void fillerOfArrayWithConstantSequence(int[] inputArray, int value) {

        Scanner sc = new Scanner(System.in);

        int amountOfElements = inputArray.length;


        int j = 0;

        while (j < amountOfElements) {

            inputArray[j] = value;
            j++;

        }

        System.out.println("The array is full");
        System.out.println("The end of the method.");
        sc.close();
    }


    //-------------------------------------------------- periodic

    static void fillerOfArrayWithPeriodicalSequence(int[] inputArray, int[] period) {

        Scanner sc = new Scanner(System.in);

        int divisOfArrays = inputArray.length / period.length;
        int lastArraylength = inputArray.length - (period.length * divisOfArrays);

        int multipl = 0;
        int i = 0;
        int j = 0;

        while (i < (period.length * divisOfArrays)) {
            inputArray[i] = period[multipl];
            if (multipl++ == period.length - 1) multipl = 0;
            i++;
        }

        while (j < lastArraylength) {
            inputArray[j + period.length * divisOfArrays] = period[j];
            j++;
        }

        System.out.println("The array is full");
        System.out.println("The end of the method.");
        sc.close();
    }


    //-------------------------------------------------- arithmetic

    static void fillerOfArrayWithAriphmeticProgression(int[] inputArray, int initialElement, int difference) {

        int i = 1;
        inputArray[0] = initialElement;

        while (i < inputArray.length) {

            inputArray[i] = inputArray[i - 1] + difference;

            i++;
        }

        System.out.println("The array is full");
        System.out.println("The end of the method.");

    }


    //-------------------------------------------------- arithmetic

    static void fillerOfArrayWithGeometricalProgression(int[] inputArray, int initialElement, int multiplier) {

        int i = 1;
        inputArray[0] = initialElement;

        while (i < inputArray.length) {

            inputArray[i] = inputArray[i - 1] * multiplier;

            i++;
        }

        System.out.println("The array is full");
        System.out.println("The end of the method.");

    }


    //-------------------------------------------------- check in


    public static void main(String[] args) {

        int[] newArray = new int[11];
        int[] periodArray = {7, 8, 9, 10};

        fillerOfArrayWithGeometricalProgression(newArray, 7, 2);


        //---------------------------- print elements of array
        for (int outs = 0; outs < newArray.length; outs++) {
            System.out.print(newArray[outs]);
            if (outs != newArray.length - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


    }


}
