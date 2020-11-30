public class jkPrintArray {

    public  static void jkPrintArrOneInt(int[] inputArr) {

        //---------------------------- print elements of array

        int printArrLen = inputArr.length;

        for (int printCount = 0; printCount < printArrLen; printCount++) {
            System.out.print(inputArr[printCount]);
            if (printCount != printArrLen - 1) System.out.print(", ");
        }
        System.out.println();
        //---------------------------- /print elements of array

    }


    public  static void jkPrintArrOneLong(long[] inputArr) {

        //---------------------------- print elements of array

        int printArrLen = inputArr.length;

        for (int printCount = 0; printCount < printArrLen; printCount++) {
            System.out.print(inputArr[printCount]);
            if (printCount != printArrLen - 1) System.out.print(", ");
        }
        System.out.println();
        //---------------------------- /print elements of array

    }


}
