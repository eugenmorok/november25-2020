import java.util.Scanner;

public class jkSearchMaxMethod {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the array length here: ");
            int arrayLen = sc.nextInt();

            int[] newArray = new int[arrayLen];
            int i = 0;

            while (i < arrayLen) {
                System.out.printf("Enter the %d element(int): ", i + 1);
                newArray[i] = sc.nextInt();
                i++;
            }

            int arraySum = 0;
            boolean isAqual = true;

            for (int k = 0; k < arrayLen; k++) arraySum += newArray[k];

            arraySum /= arrayLen;

            int j = 0;
            int maxValue = newArray[0];

            for (; j < arrayLen; j++) {
                if (arraySum != newArray[j]) isAqual = false;
                if (newArray[j] > maxValue) maxValue = newArray[j];
            }

            if (!isAqual) {
                System.out.println("The maximum value of the array is: " + maxValue + " and " +
                        "the value index is: [" + j + "]\nThe end.");
            } else System.out.println("There are NO maximum element\nThe end. ");


        }


}
