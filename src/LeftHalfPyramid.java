import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of pyramid: ");
        int rows = input.nextInt();
        int i,j;
        for (i=0;i<=rows;i++){
            for(j=rows;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
