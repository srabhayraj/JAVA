import java.util.Scanner;

public class HollowHourglassPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows for hourglass pattern: ");
        int rows = input.nextInt();
        int i,j,k;
        for(i=1;i<=rows;i++) {
            for (j = 1; j <= rows; j++) {
                if (i == j || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }


            }

            for (k = rows; k >= 1; k--) {
                if (k == j || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
