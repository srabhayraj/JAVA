import java.util.Scanner;

public class RightHalfHollowPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of pyramid: ");
        int rows = input.nextInt();
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=rows;j>=1;j--){
                if( j==1 || i==j || i==rows){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");;
                }

            }

            System.out.println();
        }
    }
}
