import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the rows of triangle: ");
        int rows = input.nextInt();
        int i,j,k,m;

        for(i=0;i<rows;i++){
            for(j=0;j<2*(rows-i) -1 ;j++){
                System.out.print(" ");
            }

            //* PATTERN TRIANGLE
//            for(k=0;k<2*i +1 ;k++){
//                System.out.print("* ");
//            }

            // 123 PATTERN TRIANGLE
//            for(k=1;k<=2*i +1 ;k++){
//                System.out.print(k + " ");
//            }

            //111 PATTERN TRIANGLE
            for(k=1;k<=2*i +1 ;k++){
                m=i+1;
                System.out.print(m + " ");
            }

            System.out.println("");

        }
    }
}
