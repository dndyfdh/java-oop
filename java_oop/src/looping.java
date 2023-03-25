public class looping {
    public static void main(String[] args) {
        //For loop
        for (int counter =0; counter <= 10; counter++) {
            System.out.println("Loop ke -" + counter);
        }

        //While loop
        int counterloop = 0;
        while (counterloop <=5) {
            System.out.println("While loop ke- " + counterloop);
            counterloop++;
        }

        //Do while loop
        do {
            System.out.println("Do While loop ke -" + counterloop);
            counterloop++;
        } while (counterloop <= 10);

        Number[] myNumbers = {90, 10, 11, 20};
        for (int counter = 0; counter < myNumbers.length; counter++) {
            System.out.println(myNumbers[counter]);

        }
    }
    
}