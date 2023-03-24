package ApachePOI;

public class _01_2DArray {
    public static void main(String[] args) {

        //Just to remember 2D Arrays.


        String[][] zoo = {{"Lion", "4"}, {"Tiger", "2"}, {"Elephant", "5"}, {"Shark", "3"}};

        System.out.println("First row and first column is: " + zoo[0][0]);
        System.out.println("Fourth row and second column is: " + zoo[3][1]);

        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < zoo[i].length; j++) {
                System.out.print(zoo[i][j]+", ");
            }
            System.out.println();
        }
    }
}
