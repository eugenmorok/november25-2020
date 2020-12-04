public class PseudoRandomNumberGenerators {

    //----------------------------------------------------------------------------- time

    static void generatorOfPseudorandomNumbersTime(int[] inputArray) {

        int inputArrayLen = inputArray.length;
        int i = 0;

        while (i < inputArrayLen) {

            inputArray[i] = (int)(System.currentTimeMillis() % 256);
            i++;

        }

        //System.out.println("The array is full, the end of the timegen method");

    }

    //----------------------------------------------------------------------------- /time


    //----------------------------------------------------------------------------- linear

    static void linearGeneratorOfPseudorandomNumbers(int[] inputArray, int k, int b) {

        int inputArrayLen = inputArray.length;

        inputArray[0] = inputArrayLen;

        int i = 1;

        while (i < inputArrayLen) {

            inputArray[i] = (k * inputArray[i - 1] + b) % 256;

            i++;
        }

        //System.out.println("The array is full, the end of the line method");
    }

    //----------------------------------------------------------------------------- /linear


    //----------------------------------------------------------------------------- quadratic

    static void quadraticGeneratorOfPseudorandomNumbers(int[] inputArray, int k, int b) {

        int inputArrayLen = inputArray.length;

        inputArray[0] = inputArrayLen;

        int i = 1;

        while (i < inputArrayLen) {

            inputArray[i] = (k * inputArray[i - 1] * inputArray[i - 1] + b) % 256;

            i++;
        }

        //System.out.println("The array is full, the end of the quad method");
    }

    //----------------------------------------------------------------------------- /quadratic


    //----------------------------------------------------------------------------- bits


    static void biteGeneratorOfPseudorandomNumbersByStradukhinEI
            (int[] inputArray, int isSeed) {

        //-------------------------------- mini random seed generator
        long v = System.currentTimeMillis();
        v = v / 100 * v % 100000;
        v = v & ~(1 << (v % 10 - 1));
        v = (v ^ (v >> 31)) - (v >> 31);

        //System.out.println(v);
        //-------------------------------- /mini random seed generator

        int k = 0;
        int b = 0;

        if (isSeed != 0) {
            k = isSeed % 256;
            b = isSeed / 128;
            v = isSeed % 100;
        } else {
            k = (int) v % 100;
            b = (int) v;
        }

        int arrLen = inputArray.length;


        inputArray[0] = (byte) ((k * v * v + b) % 256);

        int i = 1;
        int element = 0;
        int memo = 0;
        //int switcher = 0;


        while (i < arrLen) {

            if ((i & 1) == 1) {

                element = (byte) ((inputArray[i - 1] * inputArray[i - 1] * k + b) / 327) & 15;
                element = (byte) (((element ^ (1 << i)) & ~(1 << (k / b))) % 100) & 15;
                inputArray[i] = (byte) ((element ^ (element >> 31)) - (element >> 31)) & 15;

            } else {

                element = (byte) ((inputArray[i - 1] * inputArray[i - 1] * k * 3 + b / 22) / 66)  & 15;
                memo = (byte) (((element ^ (element >> 31)) - (element >> 31) * 2 / 3) % 1000) & 15;
                if (i == i % (v % 100) / 2) inputArray[i] = 0;
                else inputArray[i] = (byte) memo & 15;


            }

            inputArray[0] = (byte) (i % (v % 100) / 2) & 15;
            i++;

        }

        //System.out.println("The array is full, the end of the bits method");

    }


    //----------------------------------------------------------------------------- / bits


    //----------------------------------------------------------------------------- check

    public static void main(String[] args) {
        int[] testArr = new int[28];
        int[] testArr2 = new int[100];

        generatorOfPseudorandomNumbersTime(testArr);
        jkPrintArray.jkPrintArrOneInt(testArr);
        System.out.println("");

        linearGeneratorOfPseudorandomNumbers(testArr2, 7, 13);
        jkPrintArray.jkPrintArrOneInt(testArr2);
        System.out.println("");

        quadraticGeneratorOfPseudorandomNumbers(testArr2, 77, 1313);
        jkPrintArray.jkPrintArrOneInt(testArr2);
        System.out.println("");

        biteGeneratorOfPseudorandomNumbersByStradukhinEI(testArr2, 42554);
        jkPrintArray.jkPrintArrOneInt(testArr2);
        System.out.println("");


    }

    //----------------------------------------------------------------------------- /check

}


