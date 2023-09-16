import java.util.Scanner;

public class LeftHalfHollowPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of pyramid: ");
        int rows = input.nextInt();
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++) {
                if (j==1 || j==i || i == rows) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
