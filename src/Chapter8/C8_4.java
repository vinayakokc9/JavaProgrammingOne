package Chapter8;

/**
 * Program to show fixed array of hours
 *
 * @author Vinayak Gopakumar
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8, 0},
            {7, 3, 4, 3, 3, 4, 4, 0},
            {3, 3, 4, 3, 3, 2, 2, 0},
            {9, 3, 4, 7, 3, 4, 1, 0},
            {3, 5, 4, 3, 6, 3, 8, 0},
            {3, 4, 4, 6, 3, 4, 4, 0},
            {3, 7, 4, 8, 3, 8, 4, 0},
            {6, 3, 5, 9, 2, 7, 9, 0},};

        //week
        System.out.println("\t\t" + "Su  M   T   W   Th  F  Sa   Total");

        for (int row = 0; row < hours.length; row++) {
            int total = 0;
            for (int column = 0; column < hours[0].length; column++) {
                total += hours[row][column];
            }
            hours[row][7] = total;
        }
        //printing arrays
        for (int row = 0, emp = 0; row < hours.length; row++, emp++) {
            System.out.print("Employee " + emp + "\t");
            for (int column = 0; column < hours[row].length; column++) {
                System.out.print(hours[row][column] + "   ");
            }
            System.out.println();
        }

    }

}
