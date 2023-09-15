import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of square: ");
        int rows = input.nextInt();
        int i,j;
        for(i=0;i<rows;i++){
            for(j=rows;j>0;j--){
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
