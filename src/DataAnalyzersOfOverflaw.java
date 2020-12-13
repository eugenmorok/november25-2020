public class DataAnalyzersOfOverflaw {

    //--------------------------------------------------------------------------------------- arithmetic

    static int analyzerOfOverflawOfAriphmeticProgression(int[] inputArray, int initialElement, int difference) {

        int arrLen = inputArray.length;

        int indexOF = -1;

        int j = 1;

        int a, b, c;

        while (j < arrLen) {

            a = inputArray[j - 1];
            b = inputArray[j];
            c = a + b;

            if (a > 0 & b > 0 & c < 0) {

                indexOF = j + 1;
                break;

            } else if (a < 0 & b < 0 & c > 0) {

                indexOF = j + 1;
                break;
            }

            j++;
        }


        return indexOF;

    }

    //--------------------------------------------------------------------------------------- geometric

    static int analyzerOfOverflawOfGeometricalProgression(int[] inputArray, int initialElement, int multiplier) {

        int arrLen = inputArray.length;

        int indexOF = -1;

        int j = 2;

        int a, b;

        while (j < arrLen) {

            a = inputArray[j - 1];
            b = inputArray[j];

            if (b / a != multiplier) {

                indexOF = j;
                break;

            }

            j++;
        }


        return indexOF;

    }

    //--------------------------------------------------------------------------------------- geometric


    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------check
        int[] Arr = new int[100];
        int initial = 1;
        Arr[0] = initial;
        int difference = 111111111;

        for (int i = 1; i < Arr.length; i++) {

            Arr[i] = Arr[i - 1] + difference;

        }

        jkPrintArray.jkPrintArrOneInt(Arr);

        int d = analyzerOfOverflawOfAriphmeticProgression(Arr, 1, 111111111);

        System.out.println(d);

        //---------------------------------------------------------------------------------------------

        int[] ArrQ = new int[50];
        int initialQ = 1;
        ArrQ[0] = initialQ;
        int multiplier = 2;

        for (int j = 1; j < ArrQ.length; j++) {

            ArrQ[j] = ArrQ[j - 1] * multiplier;

        }

        jkPrintArray.jkPrintArrOneInt(ArrQ);

        int dQ = analyzerOfOverflawOfGeometricalProgression(ArrQ, 1, 2);

        System.out.println(dQ);

        //---------------------------------------------------------------------------------------/check

    }


}
