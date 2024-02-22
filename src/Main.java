import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;

        System.out.print("Satır Sayısını Giriniz : ");
        n = inp.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }for(int k = 1; k < 2 * i; k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }for (int k = 1; k < 2*i; k++){
                System.out.print("*");
            }System.out.println();
        }

    }
}