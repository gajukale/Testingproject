public class Lab_044_Array_Iterate_for_Loop {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Rows: " + matrix.length);

        for (int i = 0; i < matrix.length; i++) { // loop over rows
            for (int j = 0; j < matrix[i].length; j++) { // loop over columns
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
