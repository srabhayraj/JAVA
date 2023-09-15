import java.util.Scanner;

public class RightHalfPatternDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of pyramid (rows): ");
        int rows = input.nextInt();
        int i,j;
        for (i=0;i<=rows;i++){
            for (j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
