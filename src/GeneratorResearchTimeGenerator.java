public class GeneratorResearchTimeGenerator {

    public static void main(String[] args) {

        int[] someArray = new int [15];

        PseudoRandomNumberGenerators.generatorOfPseudorandomNumbersTime(someArray);


        //----------------------------------------------------------------------------------------checker


            System.out.println("The input array:");
            jkPrintArray.jkPrintArrOneInt(someArray);
            System.out.println();

            System.out.print("*method: analyzerOfDistribution:");
            System.out.println("\n|element|count|");
            int[][] arrayS = DataAnalyzer.analyzerOfDistribution(someArray, 1, 14);
            jkPrintArray.jkPrintArrTwoInt(arrayS, 9);


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


