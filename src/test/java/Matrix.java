import java.util.ArrayList;

public class Matrix {




    public static int[][] indexOfFirstNonZero(int[][]matrix){
        int[][] matrix = {
                {-27, 0,  -22, -21, 0},
                {-24, 0, -100, -94, 0},
                { 15, 0,   69, -38, 0},
                {-56, 0,    3, -68, 0},
                { 30, 0,  -92,  50, 0}

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = Matrix.indexOfFirstNonZero(matrix);


        ArrayList<Integer> actual = Matrix.indexOfFirstNonZero(matrix);

        for(int i = 0; i < expected.size(); i++){
            if(expected.get(i) == actual.get(i)){
                int number = actual.get(i);
                System.out.println("First null nonzero column is: " +  number);
            }

        }
        ;


    }


    public static int[][] getMinimumOfRows(int[][] array){
            int min = 0;

            //Checking first if array is empty
            if (array.length > 0 && array[0].length > 0) {
                for (int i = 0; i < array.length; i++) {
                    min = array[0][0];      //needed when array only contains negative numbers
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] < min) {
                            min = array[i][j];
                        }
                    }
                }
            }
            return min;
        }

    }


}


