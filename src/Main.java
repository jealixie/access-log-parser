import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber;
        firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber;
        secondNumber = new Scanner(System.in).nextInt();
        System.out.println("Сумма:");
        int sum=firstNumber+secondNumber;
        System.out.println(sum);
        System.out.println("Разность:");
        int difference=firstNumber-secondNumber;
        System.out.println(difference);
        System.out.println("Произведение:");
        int product=firstNumber*secondNumber;
        System.out.println(product);
        System.out.println("Частное:");
        double quotient=(double)firstNumber/secondNumber;
        System.out.println(quotient);
    }
}
