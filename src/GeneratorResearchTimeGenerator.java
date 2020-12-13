public class GeneratorResearchTimeGenerator {

    public static void main(String[] args) {

        int[] someArray = new int [150];

        PseudoRandomNumberGenerators.generatorOfPseudorandomNumbersTime(someArray);


        //----------------------------------------------------------------------------------------checker


            System.out.println("The input array:");
            jkPrintArray.jkPrintArrOneInt(someArray);
            System.out.println();

            System.out.print("*method: analyzerOfDistribution:\n");

            int[] arrayS = DataAnalyzer.analyzerOfDistribution(someArray, 1, 140);
            jkPrintArray.jkPrintArrOneInt(arrayS);


            //------------------------------------------------------------------------------------------

            System.out.println();


            System.out.println("*method: dispersionOfDistributionByAbsValue:");
            System.out.println(DataAnalyzer.dispersionOfDistributionByAbsValue(arrayS));


            //------------------------------------------------------------------------------------------

            System.out.println();


            System.out.println("*method: dispersionOfDistributionByQuadraticValue:");
            System.out.println(DataAnalyzer.dispersionOfDistributionByQuadraticValue(arrayS));

        }
        //----------------------------------------------------------------------------------------/checker

    }


