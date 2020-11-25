public class OutputOfTheArrayInIntegerWithoutIndexes {

    public static void outputArrayInInteger(int numberOfElementsInLine, String nameOfTheOutputArray) {

        int[] sArray = MyEasyGeneratorOfPosForCourse1.getMineGenArray(10);

        System.out.println(nameOfTheOutputArray);

        for (int i = 1; i < sArray.length + 1; i++) {

            System.out.print(sArray[i - 1] + "    ");
            if (i % numberOfElementsInLine == 0) System.out.println("\n");


        }

    }

    public static void main(String[] args) {

        outputArrayInInteger(3, "The array of random values:\n");

    }

}
