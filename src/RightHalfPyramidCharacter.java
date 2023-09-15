import java.util.Scanner;

public class RightHalfPyramidCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of pyramid (rows): ");
        int rows = input.nextInt();
        int i,j;
        for(i=0;i<=rows;i++){
            for(j=0;j<=i;j++){
                System.out.print("A" + j);
            }
            System.out.println();
        }
    }
}
