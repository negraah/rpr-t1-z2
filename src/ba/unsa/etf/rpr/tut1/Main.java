package ba.unsa.etf.rpr.tut1;
import java.util.Scanner;


public class Main {

    private static int sumaCifara(int n){
        int x=0, suma=0;
        while(n!=0){
            x = n%10;
            suma = suma + x;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
    int n ;
    System.out.println("Unesite jedan broj: ");
    Scanner ulaz = new Scanner(System.in);
    n = ulaz.nextInt();
    for(int i=1; i<=n; i++){
        if(i%sumaCifara(i)==0){
            System.out.println(i);
        }
    }

    }
}
