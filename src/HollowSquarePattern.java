import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of square: ");
        int rows = input.nextInt();
        int i,j;

        //MY LOGIC
        for(i=1;i<=rows;i++){
            for(j=rows;j>0;j--){
                if(i==1 || i==rows || j==1 || j==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //GFG LOGIC
//        for(i=0;i<rows; i++){
//            for(j=0;j<rows;j++){
//                if(i>0 && i<rows-1 && j>0 && j<rows-1){
//                    System.out.print("  ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

    }
}
