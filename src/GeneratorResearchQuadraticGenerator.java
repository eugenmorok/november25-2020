public class GeneratorResearchQuadraticGenerator {

    public static void main(String[] args) {

        int newSomeArrayLength = 300;

        int[] someArray = new int[newSomeArrayLength];
        int[] workArray;

        int range = 1000;

        int k = 0, resultKAbs = 0, resultKQuad = 0;
        int b = 0, resultBAbs = 0, resultBQuad = 0;
        double disperseAbs, disperseQuadratic, tempAbs, tempQuad;

        int bottomValue = 0;
        int topValue = 299;

        PseudoRandomNumberGenerators.quadraticGeneratorOfPseudorandomNumbers(someArray, k, b);

        workArray = DataAnalyzer.analyzerOfDistribution(someArray, bottomValue, topValue);


        disperseAbs = DataAnalyzer.dispersionOfDistributionByAbsValue(workArray);

        disperseQuadratic = DataAnalyzer.dispersionOfDistributionByQuadraticValue(workArray);


        for (k = 0; k < range; k++) {

            for (b = 0; b < range; b++) {

                //System.out.println(k + "..." + b);

                PseudoRandomNumberGenerators.quadraticGeneratorOfPseudorandomNumbers(someArray, k, b);

                workArray = DataAnalyzer.analyzerOfDistribution(someArray, bottomValue, topValue);

                tempAbs = DataAnalyzer.dispersionOfDistributionByAbsValue(workArray);

                tempQuad = DataAnalyzer.dispersionOfDistributionByQuadraticValue(workArray);


                if (tempAbs < disperseAbs) {

                    disperseAbs = tempAbs;
                    resultKAbs = k;
                    resultBAbs = b;
                }

                if (tempQuad < disperseQuadratic) {

                    disperseQuadratic = tempQuad;
                    resultBQuad = b;
                    resultKQuad = k;
                }

                /*
                System.out.printf("\nk = %d, b = %d for disperseAbs = %f; " +
                                "\nk = %d, b = %d for disperseQuadratic = %f",
                        resultKAbs, resultBAbs, disperseAbs, resultKQuad, resultBQuad, disperseQuadratic);

                 */

            }

            //System.out.println(k + "..." + b);

        }


        //----------------------------------------------------------------------------------------checker

        System.out.println();
        System.out.print("\nThe result for linearGeneratorOfPseudoRandomNumbers:");
        System.out.printf("\nk = %d, b = %d for disperseAbs = %f; " +
                        "\nk = %d, b = %d for disperseQuadratic = %f",
                resultKAbs, resultBAbs, disperseAbs, resultKQuad, resultBQuad, disperseQuadratic);


    }
    //----------------------------------------------------------------------------------------/checker

}


