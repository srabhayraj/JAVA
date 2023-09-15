import java.util.Scanner;

public class LeftHalfPyramidReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of pyramid: ");
        int rows = input.nextInt();
        int i,j,k;

        for (i=0;i<=rows;i++){
            for(j=rows;j>i;j--){
                System.out.print("  ");

            }
            for(k=i;k>0;k--){
                System.out.print("* ");

            }
            System.out.println(" ");


        }

    }
}
