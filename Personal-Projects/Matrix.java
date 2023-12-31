import java.util.Scanner;
public class Matrix {

    public static float[][] reducedEchelon(float[][] echelon, int targetRow, int targetColumn, int numRows, int numColumns){
        /*Starting from the first row and first column*/
        if (targetRow == numRows || targetColumn == numColumns){
            return echelon;
        }
        else if (echelon[targetRow][targetColumn] == 1){//Making 1 the only nonzero in a column
            for(int i = 0; i < numRows; i++){
                float temp = echelon[i][targetColumn];
                if(i != targetRow && echelon[i][targetColumn] != 0){
                    for(int j = 0; j < numColumns; j++){
                        echelon[i][j] = echelon[targetRow][j] * (-1 * temp) + echelon[i][j];
                    }
                }
            }
            return reducedEchelon(echelon, targetRow + 1, targetColumn + 1, numRows, numColumns);
        }
        else if (echelon[targetRow][targetColumn] < 0 || echelon[targetRow][targetColumn] > 1){
            float tempNum = echelon[targetRow][targetColumn];
            for(int i = 0; i < numColumns; i++){
                echelon[targetRow][i] = echelon[targetRow][i]/tempNum;
            }
            return reducedEchelon(echelon, targetRow, targetColumn, numRows, numColumns);
        }
        return echelon;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("No. of Rows: ");
        int rows = scan.nextInt(); /*Minimum no. of 2 */
        while (rows < 1){
            System.out.println("Must be greater than 0");
            System.out.print("No. of Rows: ");
            rows = scan.nextInt(); /*Minimum no. of 2 */
        }
        System.out.print("No. of Columns: ");
        int columns = scan.nextInt(); /*Minimum no. of 3 */
        while (columns < 1){
            System.out.println("Must be greater than 0");
            System.out.print("No. of Rows: ");
            columns = scan.nextInt(); /*Minimum no. of 3 */
        }
        float[][] matrix = new float[rows][columns];
        for(int i = 0; i < rows; i++){ /*Writing values to array*/
            for(int j = 0; j < columns; j++){
                System.out.print("Input a value for point (" + i + "," + j + "): ");
                matrix[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){ /*Printing values of the matrix*/
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        float[][] reducedMatrix = reducedEchelon(matrix, 0, 0, rows, columns);

        for(int i = 0; i < rows; i++){ /*Printing values of the reduced matrix or reduced echelon form*/
            for(int j = 0; j < columns; j++){
                System.out.print(reducedMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
