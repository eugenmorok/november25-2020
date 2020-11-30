public class MyEasyGeneratorOfPosForCourse2 {

    public static int[] getMineGenArray(int enteredArrLen) {

        //-------------------------------- mini random seed generator
        long v = System.currentTimeMillis();
        v = v / 100 * v % 100000;
        v = v & ~(1 << (v % 10 - 1));
        v = (v ^ (v >> 31)) - (v >> 31);

        //System.out.println(v);
        //-------------------------------- /mini random seed generator

        boolean isSeed = true;

        int k = 0;
        int b = 0;

        if (isSeed) {
            k = 375;
            b = 756828;
            v = 149;
        } else {
            k = (int) v % 100;
            b = (int) v;
        }

        int arrLen = enteredArrLen;

        int[] newArray = new int[arrLen];

        newArray[0] = 59;

        int i = 1;
        int element = 0;
        int memo = 0;
        //int switcher = 0;


        while (i < arrLen) {

            if ((i & 1) == 1) {

                element = (newArray[i - 1] * newArray[i - 1] * k + b) / 327;
                element = ((element ^ (1 << i)) & ~(1 << (k / b))) % 100;
                newArray[i] = (element ^ (element >> 31)) - (element >> 31);

            } else {

                element = (newArray[i - 1] * newArray[i - 1] * k * 3 + b / 22) / 66;
                memo = ((element ^ (element >> 31)) - (element >> 31) * 2 / 3) % 1000;
                if (i == i % (v % 100) / 2) newArray[i] = 0;
                else newArray[i] = memo;


            }

            newArray[0] = (int) (i % (v % 100) / 2);
            i++;

        }

        return newArray;

    }
}
