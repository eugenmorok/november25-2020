public class GeneratorResearchLinearGenerator {

    public static void main(String[] args) {

        int[] someArray = new int[200];

        int range = 1000;

        double[][] workArray = new double[range * range][3];
        int workIterator = 1;

        PseudoRandomNumberGenerators.linearGeneratorOfPseudorandomNumbers(someArray, 0, 0);
        workArray[0][0] = DataAnalyzer.dispersionOfDistributionByAbsValue(someArray);
        workArray[0][1] = 0;
        workArray[0][2] = 0;

        for (int k = 0; k < range; k++) {

            for (int b = 0; b < range; b++) {

                PseudoRandomNumberGenerators.linearGeneratorOfPseudorandomNumbers(someArray, k, b);
                workArray[workIterator][0] = DataAnalyzer.dispersionOfDistributionByAbsValue(someArray);

                if (workArray[workIterator][0] < workArray[workIterator - 1][0]) {

                    System.out.printf("\ndisp = %f, k = %d, b = %d", workArray[workIterator][0], k, b);
                    System.out.println();
                    jkPrintArray.jkPrintArrOneInt(someArray);

                    workArray[0][0] = workArray[workIterator][0];
                    workArray[0][1] = k;
                    workArray[0][2] = b;

                    workIterator++;

                }


            }



        }




        //----------------------------------------------------------------------------------------checker

        /*
        System.out.println("The input array:");
        jkPrintArray.jkPrintArrOneInt(someArray);
        System.out.println();

        System.out.print("*method: analyzerOfDistribution:");
        System.out.println("\n|element|count|");
        int[][] arrayS = DataAnalyzer.analyzerOfDistribution(someArray, 1, 14);
        jkPrintArray.jkPrintArrTwoInt(arrayS, 9);
        */

        //------------------------------------------------------------------------------------------

        System.out.println();


        System.out.println("*method: dispersionOfDistributionByAbsValue:");
        System.out.println(DataAnalyzer.dispersionOfDistributionByAbsValue(someArray));


        //------------------------------------------------------------------------------------------

        System.out.println();


        System.out.println("*method: dispersionOfDistributionByQuadraticValue:");
        System.out.println(DataAnalyzer.dispersionOfDistributionByQuadraticValue(someArray));

    }
    //----------------------------------------------------------------------------------------/checker

}


