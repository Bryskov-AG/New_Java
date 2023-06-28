package Homework;
import java.util.Scanner;

public class Program {
    

   
    public static void main(String[] args) {

        // summaAndMultiplication();
        // primeNumbers();
        // calculator();
        boolean f = true;
        while(f){
            System.out.println("==========================================");
            System.out.println("Укажите номер интересующей Вас задачи: ");
            System.out.println("1-Сумма и Произведение чисел от 1 до n");
            System.out.println("2-Простые числа от 1 до 1000");
            System.out.println("3-Калькулятор");
            System.out.println("0-Завершение работы приложения");
            System.out.println("==========================================");
            Scanner scanner = new Scanner(System.in);
            int no = Integer.parseInt(scanner.nextLine());
            // scanner.close();

            switch(no){

                case 1:
                    summaAndMultiplication();
                    break;

                case 2:
                    primeNumbers();
                    break;

                case 3:
                    calculator();
                    break;
            

                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;


                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода!");
                    break;
                    
        }
        
        }
        
        
    
    }
    

    
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// =============================================================================================
    static void summaAndMultiplication(){
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // scanner.close();
        int summa = 0;
        int multiplication = 1;

        for(int i = 1; i <= n; i++){
            summa += i;
            multiplication *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d\n ", n, summa);
        System.out.printf("Произведение чисел от 1 до %d: %d\n ", n, multiplication);
        
        
    }

    // Вывести все простые числа от 1 до 1000
    // ================================================
    static void primeNumbers() {
        System.out.println("Простые числа от 1 до 1000: ");

        // Перебираем все числа от 2 до 1000
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            // Проверяем, является ли число простым
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Если число простое, выводим его
            if (isPrime) {
                System.out.printf(" %d", number);
                
            }
            
        }
        System.out.println();
    }
     
    // Реализовать простой калькулятор
    // ================================================
    static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double number_1 = scanner.nextDouble();

        System.out.print("Введите знак действия,которое хотите совершить (+),(-),(/),(*) : ");
        char action = scanner.next().charAt(0);

        System.out.print("Введите второе число : ");
        double number_2 = scanner.nextDouble();
        

        double result = 0.0;

        switch(action){

            case '+':
                result = number_1 + number_2;
                break;

            case '-':
                result = number_1 - number_2;
                break;

            case '*':
                result = number_1 * number_2;
                break;

            case '/':
                if (number_2 != 0) {
                    result = number_1 / number_2;
                } else {
                    System.out.println("Ошибка: деление на ноль недопустимо.");
                    System.exit(0);
                }
                
                break;
            default:
                System.out.println("Ошибка: неверный символ действия.");
                System.exit(0);

            System.out.println("Результат: " + result);

        }
        
        

}

}





    




