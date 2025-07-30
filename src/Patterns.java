import java.util.Scanner;

public class Patterns {
    public static void pattern1(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=n-1 ; i>=1 ; i--){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i=1 ;  i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            for (int k=1 ; k<=i ; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" " + (char)(64+k));
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" "+(char)(64+k));
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" "+(char)(64+k));
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void pattern6_1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern6(n);
    }
}
