package HarryClasses;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [] marks; // One dimensional array
        int [][] flats; //2D array
        flats = new int [2][4];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[0][3] = 104;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[1][3] = 204;

     for (int i = 0;i<flats.length;i++){
         for (int j=0; j<flats[i].length;j++){
             System.out.print(flats[i][j]);
             System.out.print(" ");
         }
         System.out.println();
     }

    }
}
