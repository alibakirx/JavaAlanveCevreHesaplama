import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int yariCap;
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.printf("Dairenin alanını ve çevresini bulmak için yarıçapı giriniz: ");
        yariCap = input.nextInt();


        System.out.printf("Dairenin Alani: %,.3f ", (yariCap * yariCap * PI));

        System.out.printf("Dairenin çevresi: %,.3f ",  (2 * yariCap * PI));





    }
}