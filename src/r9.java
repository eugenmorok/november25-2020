public class r9 {


    public static void main(String[] args) {


        int[] unsortedArray = new int[8];

        PseudoRandomNumberGenerators.linearGeneratorOfPseudorandomNumbers(unsortedArray, 7, 15);

        jkPrintArray.jkPrintArrOneInt(unsortedArray);

        int arrayTestLength = unsortedArray.length;

        int buffer = 0;
        int j = 0;

        for (int i = 0; i < arrayTestLength; i++) {


            buffer = unsortedArray[i];

            //j = 0;

            /*

            while (j < i) {


                if (buffer < unsortedArray[j]) {

                    unsortedArray[j - 1] = unsortedArray[j];
                    j++;

                }

            }
            */

            j = i - 1;

            while (j > 0) {


                if (buffer < unsortedArray[j]) {

                    unsortedArray[j - 1] = unsortedArray[j];
                    j--;

                }

            }


            //------------------------------------------------------------------insert
            unsortedArray[j+1] = buffer;

        }

        jkPrintArray.jkPrintArrOneInt(unsortedArray);

    }


}
