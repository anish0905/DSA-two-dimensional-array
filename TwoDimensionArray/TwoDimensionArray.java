class TwoDimensionArray {
    int[][] arr;

    public TwoDimensionArray(int rsize, int csize) {
        arr = new int[rsize][csize];

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;

            }

        }

    }

    public void insertTDA(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is inserted successfully");

            } else {
                System.out.println("Invalid row & column");
            }

        } catch (Exception e) {
            System.out.println("Invalid row & column");
        }
    }

    public void traversal() {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }

        }

    }

    public int Searching(int value) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[col][row] == value) {
                    System.out.println("the value is present in the index of" + "col "+ col + " " +"row "+ "" +row);
                    return 1;
                }
            }

        }
        return 0;

    }


public void deletion(int col , int row)
{
    try{
        arr[col][row] = Integer.MIN_VALUE ;
        System.out.println("the cell is deleted successfully" + arr[col]+arr[row]);
    }
    catch(Exception e)

    {
        System.out.println("Invalid index");
    }
}




}