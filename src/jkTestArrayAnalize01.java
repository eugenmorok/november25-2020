public class jkTestArrayAnalize01 {


    public static void main(String args[]) {

        int len = 200;

        int[] finalArray = new int[len];

        finalArray = MyEasyGeneratorOfPosForCourse2.getMineGenArray(len);

        //---------------------------- print elements of array
        for (int j = 0; j < len; j++) {
            if (j > len) System.out.print(0); // check to overflow
            else System.out.print(finalArray[j]);
            if (j != len - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array

        int[][] theList = new int[len][3];
        int[] controlArray = new int[len];

        int count = 0;
        int n = 0;


        while (n < len) {


            for (int m = 0; m < len; m++) {

                if (finalArray[n] == finalArray[m]) count++;
                controlArray[m] = finalArray[m];

            }

            theList[n][0] = finalArray[n]; // save the element
            theList[n][1] = n; // save the index of element
            theList[n][2] = count; // save the count of element

            //System.out.printf("\n%d[%d] and %d is count", finalArray[n], n, count);

            n++;
            count = 0;
        }


        //---------------------------- print elements of multi array

        int rowLength = 6;
        String oneCell = "";

        System.out.println("\nelem  idx   cnt");

        for (int st = 0; st < len; st++) {  // strings

            for (int rw = 0; rw < 3; rw++) {// rows

                oneCell = " " + theList[st][rw];
                System.out.print(oneCell); //outputs

                for (int k = 0; k < rowLength - oneCell.length(); k++) {

                    System.out.print(" ");

                }

            }
            System.out.println();// \n
        }

        //---------------------------- /print elements of multi array


        //-------------------------------- mini random seed generator
        long v = System.currentTimeMillis();
        v = v / 100 * v % 100000;
        v = v & ~(1 << (v%10 - 1));
        v = (v ^ (v >> 31)) - (v >> 31);

        System.out.println(v);
        //-------------------------------- /mini random seed generator


    }
}
