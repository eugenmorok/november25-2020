
public class r2 {

    public static void main(String[] args) {

        int[] sArray = MyEasyGeneratorOfPosForCourse1.getMineGenArray(5);

        //---------------------------- print elements of array
        for (int j = 0; j < 5; j++) {
            System.out.print(sArray[j]);
            if (j != 5 - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array

    }
}
