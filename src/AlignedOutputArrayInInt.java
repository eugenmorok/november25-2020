public class AlignedOutputArrayInInt {

    public static void outputArrayInInteger(int numberOfElementsInLine, String nameOfTheOutputArray) {

        int[] sArray = MyEasyGeneratorOfPosForCourse1.getMineGenArray(100);

        System.out.println(nameOfTheOutputArray);

        int rowLength = 12;
        String oneCell = "";

        for (int i = 1; i < sArray.length + 1; i++) {

            oneCell = "[" + (i - 1) + "] = " + sArray[i - 1];

            System.out.print(oneCell);

            for (int k = 0; k < rowLength - oneCell.length(); k++) {

                System.out.print(" ");

            }

            System.out.print(" ");

            if (i % numberOfElementsInLine == 0) System.out.println("\n");


        }

    }

    public static void main(String[] args) {

        outputArrayInInteger(3, "The array of random values:\n");

    }

}
