package vn.codegym;
import java.lang.Math;

public class Prime {
    public static void main(String[] args) {
        int prime = 1;
        int cout = 0;

        while (prime < 100)
        {
            for(int i = 2; i <= Math.sqrt(prime); i++){
                if(prime % i == 0){
                    cout++;
                }
            }
            if(cout == 0){
                System.out.print(prime+" ");
            }
            cout = 0;
            prime++;
        }
    }
}
