package uebung1;

public class ulam_function {

    public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein: ");
        int n = scan.nextInt();

        System.out.println("Sie haben die Zahl " + n + " eingegeben");

        while(n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            }else{
                n = (n * 3) + 1;
                System.out.println(n);
            }
        }
    }
}
