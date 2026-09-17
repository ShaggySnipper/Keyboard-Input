import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sumOf3 = num1 + num2 + num3;
        System.out.println(sumOf3);

        sc.close();
        
        //Remember to close the Scanner
        
    }
}
