public class MyEasyGeneratorOfPosForCourse1 {

    public static int[] getMineGenArray(int enteredArrLen) {

        int k = 3897;
        int b = 6584968;
        int arrLen = enteredArrLen;

        int[] newArray = new int[arrLen];

        newArray[0] = 59;

        int i = 1;
        int element = 0;
        //int switcher = 0;


        while (i < arrLen) {

            if ((i & 1) == 1) {

                element = (newArray[i - 1] * newArray[i - 1] * k + b) / 327;
                element = ((element ^ (1 << i)) & ~(1 << (k / b))) % 100;
                newArray[i] = (element ^ (element >> 31)) - (element >> 31);

            } else {

                element = (newArray[i - 1] * newArray[i - 1] * k * 3 + b / 22) / 66;
                newArray[i] = ((element ^ (element >> 31)) - (element >> 31) * 2 / 3) % 1000;

            }

            i++;

        }

        return newArray;

    }
}
