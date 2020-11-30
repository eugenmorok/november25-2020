public class DataRecovery {

    //---------------------------------------------------------------------repeater

    static void repeaterOfTheLastCorrectValue(int[] inputArray, int indexOfBadValue) {

        int arrLen = inputArray.length;
        int lastCorrectElement = inputArray[indexOfBadValue - 1];

        int i = indexOfBadValue;

        while (i < arrLen) {

            inputArray[i] = lastCorrectElement;
            i++;

        }

    }

    //---------------------------------------------------------------------/repeater



    //---------------------------------------------------------------------constrain

    static void constrainOfValues (int[] inputArray, int indexOfBadValue) {

        int minVal = -2_147_483_648;
        int maxVal = 2_147_483_647;

        int arrLen = inputArray.length;

        int i = indexOfBadValue;

        while (i < arrLen) {

            if (inputArray[i] > 0) inputArray[i] = maxVal;
            else inputArray[i] = maxVal;
            i++;
        }

    }

    //---------------------------------------------------------------------/constrain


    public static void main(String[] args) {

        //---------------------------------------------------------------------check

        int[] someArray = {1000000000, 2000000000, -294967296, -589934592, -1179869184};

        jkPrintArray.jkPrintArrOneInt(someArray);

        repeaterOfTheLastCorrectValue(someArray, 2);

        jkPrintArray.jkPrintArrOneInt(someArray);

        //---------------------------------------------------------------------/check
        System.out.println();
        //---------------------------------------------------------------------check

        int[] someArray2 = {-1000_000_000, -2000_000_000, 294967296, 589934592, 1179869184};

        jkPrintArray.jkPrintArrOneInt(someArray2);

        constrainOfValues(someArray2, 2);

        jkPrintArray.jkPrintArrOneInt(someArray2);

        //---------------------------------------------------------------------/check



    }
}
