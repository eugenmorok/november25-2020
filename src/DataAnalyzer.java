public class DataAnalyzer {

    public static int[][] analyzerOfDistribution(int[] inputArray, int bottomValue, int topValue) {


        /*
        Метод возвращает массив, индексы которого равны числам исследуемого массива с соответствующим смещением,
        а значения по этим индексам соответственно равны количеству чисел в анализируемом массиве.
        bottomValue - нижняя граница анализируемого диапазона, topValue - верхняя граница анализируемого диапазона.

        Например: вызов метода analyzerOfDistribution (someArray, 5, 7), где массив someArray равен
        {4, 5, 3, 7, 7, 5, 6, 7, 34, 12}, вернёт массив-распределение {2, 1, 3}, где индексу 0 соответствует число 5,
        значение 2 означает, что 5 встретилась 2 раза, далее индексу 1 соответствует число 6, значение 1 означает,
        что 6 встретилась 1 раз, далее индексу 2 соответствует число 3, значение 3 означает, что 7 встретилась 3 раза.
        */

        //--------------------------------------------------------abs of range

        if (topValue < bottomValue) {

            topValue ^= bottomValue;
            bottomValue ^= topValue;
            topValue ^= bottomValue;

        }

        //--------------------------------------------------------/abs of range


        int inputArrayLength = inputArray.length;

        int arrayForAnalysisLength = topValue - bottomValue + 1;

        int[][] arrayForAnalysis = new int[arrayForAnalysisLength][2];

        int elementCount = 0;


        //-----------------------------------------------------------------to fill the work array

        int s = 0;
        for (int k = bottomValue; k < topValue + 1; k++) {

            arrayForAnalysis[s][1] = inputArray[k];
            s++;

        }

        //-----------------------------------------------------------------/to fill the work array

        for (int i = 0; i < arrayForAnalysisLength; i++) {

            for (int j = 0; j < inputArrayLength; j++) {

                //System.out.println(arrayForAnalysis[i][0] + "..." + inputArray[j]);

                if (arrayForAnalysis[i][1] == inputArray[j]) elementCount++;

            }

            arrayForAnalysis[i][0] = arrayForAnalysis[i][1];
            arrayForAnalysis[i][1] = elementCount;
            elementCount = 0;

        }


        //----------------------------------------------------------------------------------desc sort

        for (int first = 0; first < arrayForAnalysisLength; first++) {

            int mIdx = first;
            int mElem = arrayForAnalysis[first][0];

            for (int sec = first; sec < arrayForAnalysisLength; sec++) {

                if (arrayForAnalysis[sec][1] > arrayForAnalysis[mIdx][1]) {
                    mIdx = sec;
                    mElem = arrayForAnalysis[sec][0];

                }
            }
            //-------------------------------------------------to swap

            int memo = arrayForAnalysis[first][1];
            int memo2 = arrayForAnalysis[first][0];

            arrayForAnalysis[first][1] = arrayForAnalysis[mIdx][1];
            arrayForAnalysis[first][0] = arrayForAnalysis[mIdx][0];

            arrayForAnalysis[mIdx][1] = memo;
            arrayForAnalysis[mIdx][0] = memo2;

            //-------------------------------------------------/to swap
        }

        //----------------------------------------------------------------------------------/desc sort


        return arrayForAnalysis;

    }


    static double dispersionOfDistributionByAbsValue(int[] inputArray) {

        /*
        Метод возвращает значение дисперсии входного массива(обычно это будет массив-распределение от предыдущего
        метода analyzerOfDistribution ). Дисперсия - усреднённый (интегральный) показатель разброса значений в
        последовательности (выборке данных).
        Расчёт дисперсии в double. Сначала находится среднее значение массива в double. Далее находятся разности
        среднего значения с каждым значением массива, эти разности суммируются. Это и будет дисперсия, расчитанная по
        модулю. Таким образом, дисперсия - сумма модулей разностей каждого значения массива и среднего значения массива.

        Например: вызов метода dispersionOfDistributionByAbsValue (someArray), где массив someArray равен
        { 14, 6, 13 }. Среднее значение (14 + 6 + 13) / 3 = 33/3 = 11,00000. Теперь дисперсия =
        (14 - 11) + (11 - 6) + (13 - 11) = 3 + 5 + 2 = 10. Метод должен вернуть 10.
         */

        int arrayLength = inputArray.length;

        double mean = 0;
        double amount = 0;

        for (int i = 0; i < arrayLength; i++) {

            amount += inputArray[i];

        }

        mean = amount / (double) arrayLength;

        double dispersion = 0;

        double temp = 0;

        for (int j = 0; j < arrayLength; j++) {

            temp = inputArray[j] - mean;
            if (temp < 0) temp *= -1;

            dispersion += temp;

        }


        return dispersion;

    }


    static double dispersionOfDistributionByQuadraticValue(int[] inputArray) {

        /*
        Метод возвращает значение дисперсии входного массива(обычно это будет массив-распределение от предыдущего
        метода analyzerOfDistribution ). Дисперсия - усреднённый (интегральный) показатель разброса значений в
        последовательности (выборке данных).
        Расчёт дисперсии в double. Сначала находится среднее значение массива в double. Далее находятся квадраты
        разностей среднего значения с каждым значением массива, эти квадраты суммируются. Это и будет дисперсия,
        расчитанная по среднеквадратичному методу. Таким образом, дисперсия - сумма квадратов разностей каждого
        значения массива и среднего значения массива.

        Например: вызов метода dispersionOfDistributionByQuadraticValue (someArray), где массив someArray равен
        { 14, 6, 13 }. Среднее значение (14 + 6 + 13) / 3 = 33/3 = 11,00000.
        Теперь дисперсия = (14 - 11)^2 + (6 - 11)^2 + (13 - 11)^2 = 9 + 25 + 4 = 38. Метод должен вернуть 38.
         */

        int arrayLength = inputArray.length;

        double mean = 0;
        double amount = 0;

        for (int i = 0; i < arrayLength; i++) {

            amount += inputArray[i];

        }

        mean = amount / (double) arrayLength;

        double dispersion = 0;

        double temp = 0;

        for (int j = 0; j < arrayLength; j++) {

            temp = inputArray[j] - mean;

            dispersion += temp * temp;

        }


        return dispersion;

    }


    //----------------------------------------------------------------------------------------checker
    public static void main(String[] args) {

        int[] testArray200 = MyEasyGeneratorOfPosForCourse2.getMineGenArray(200);

        System.out.println("The input array:");
        jkPrintArray.jkPrintArrOneInt(testArray200);
        System.out.println();

        System.out.print("*method: analyzerOfDistribution:");
        System.out.println("\n|element|count|");
        int[][] arrayS = analyzerOfDistribution(testArray200, 1, 199);
        jkPrintArray.jkPrintArrTwoInt(arrayS, 9);


        //------------------------------------------------------------------------------------------

        System.out.println();

        int[] testArray = {14, 6, 13};

        System.out.println("*method: dispersionOfDistributionByAbsValue:");
        System.out.println(dispersionOfDistributionByAbsValue(arrayS[1]));


        //------------------------------------------------------------------------------------------

        System.out.println();


        System.out.println("*method: dispersionOfDistributionByQuadraticValue:");
        System.out.println(dispersionOfDistributionByQuadraticValue(arrayS[1]));

    }
    //----------------------------------------------------------------------------------------/checker


}
