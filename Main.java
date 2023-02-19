import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        //Roman x1 = Roman.X;
        //x1.getConverter();
        //Roman[] x = new Roman[10];
        //for(int i = 0; i < x.length; i++){
        //  System.out.println(x[i]);
        //}
        System.out.println("Enter value - ");
        a = scan.nextInt();
        System.out.println("Enter value 2 -");
        b = scan.nextInt();
        String[] action = {"+", "-", "/","*"};
        String[] regexAction = {"\\+", "-", "/", "\\*"};
        for(int i = 0; i < regexAction.length; i++) {
            regexAction[i] = scan.nextLine();
            switch (regexAction[i]){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
            }if(a <= 0 || a > 10){
                System.out.println("Enter value from 0 until 10 in value 1");
                break;
            }else if(b < 0 || b > 10) {
                System.out.println("Enter value from 0 until 10 in value 2");
                break;
            }
            System.out.println("action");
        }
    }
}