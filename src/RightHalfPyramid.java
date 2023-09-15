import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of pyramid (rows): ");
        int row = input.nextInt();
        int i,j;
        for (i=0;i<row;i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
