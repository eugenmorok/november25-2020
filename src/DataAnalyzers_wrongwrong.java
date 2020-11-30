public class DataAnalyzers_wrongwrong {

    static int analyzerOfOverflawOfAriphmeticProgression(int[] inputArray, int initialElement, int difference) {

        int arrLen = inputArray.length;

        int indexOF = -1;

        int j = 1;

        int a, b;

        while (j < arrLen) {

            a = inputArray[j];
            b = inputArray[j - 1];

            System.out.println(a - difference + "..." + b);

            if (a - b != difference) {

                indexOF = j;
                break;

            }

            j++;

        }


        return indexOF;

    }


    public static void main(String[] args) {

        int[] Arr = new int[22];
        int initial = 1;
        Arr[0] = initial;
        int difference = 111111111;

        for (int i = 1; i < Arr.length; i++) {

            Arr[i] = Arr[i - 1] + difference;

        }

        jkPrintArray.jkPrintArrOneInt(Arr);

        int d = analyzerOfOverflawOfAriphmeticProgression(Arr, 1, 111111111);

        System.out.println(d);

    }


}
