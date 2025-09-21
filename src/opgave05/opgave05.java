package opgave05;

public class opgave05 {
    public static void main(String[] args) {
        int[] listOfints = {1, 2, 3, 4, 3, 3, 3, 3, 4, 1, 2, 3};
        fourInARow(listOfints);
    }

    public static void fourInARow(int[] listOfints) {
        int counter = 0;
        for(int index = 1; index < listOfints.length; index++){

            if(listOfints[index] == listOfints[index - 1]){
                counter++;
            if (counter == 4) {
                System.out.println("there is 4 in a row of this number: " + listOfints[index]);
                return;
            }
            } else {
                counter = 1;
            }
        }
        System.out.println("No sequence of 4 was found");
    }
}