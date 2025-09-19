package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        intergerArrayRun(integerArray);
        intergerSUM(integerArray);
        System.out.println("average er: " + integerAverage(integerArray));
        System.out.println("tværsummen er: " + crossSum(integerArray));
        System.out.println("tværsum to one: " + crossSumToOne(integerArray));

    }
    private static int[] getIntegerArray() {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};
        return integerArray;
    }
    public static int crossSum(int[] intergerArray) {
        int crossSum = 0;
        for (int index = 0; index < intergerArray.length; index++) {
            while (intergerArray[index] > 9) {
                crossSum += intergerArray[index] % 10;
                intergerArray[index] = intergerArray[index] / 10;
            }
            crossSum += intergerArray[index];
        }
        return crossSum;
    }

    public static int crossSumToOne(int[] intergerArray) {
        int crossSum = 0;
        for (int index = 0; index < intergerArray.length; index++) {
            while (intergerArray[index] > 9) {
                crossSum += intergerArray[index] % 10;
                intergerArray[index] = intergerArray[index] / 10;
            }
            crossSum += intergerArray[index];
        }
        while (crossSum > 9) {
            int temp = 0;
            while (crossSum > 0) {
                temp += crossSum % 10;
                crossSum /= 10;

            }
            crossSum = temp;
        }
        return crossSum;
    }


    public static void intergerArrayRun(int[] integerArray) {
        for (int array : integerArray) {
            System.out.println(array);
        }
    }

    public static void intergerSUM(int[] integerArray) {
        int sum = 0;
        for (int index = 0; index < integerArray.length; index++) {
            sum += integerArray[index];
        }
        System.out.println("The sum is " + sum);
    }

    public static double integerAverage(int[] integerArray) {
        int sum = 0;
        int index = 0;
        for (; index < integerArray.length; index++) {
            sum += integerArray[index];
        }
        int average = sum / index;
        return average;
    }
}
