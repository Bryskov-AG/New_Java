package Homework;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.util.ArrayList;
// import java.util.List;
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

//  [4**] Задано уравнение вида q + w = e, q, w, e >= 0.
//      * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//      * Требуется восстановить выражение до верного равенства.
//      * Предложить хотя бы одно решение или сообщить, что его нет.
//      * @param args аргументы командной строки
// =====================================================================================
// public static void main(String[] args) {
//         // Читаем выражение из файла input.txt
//         String inputString = getDataFromFile("input.txt");
//         System.out.println("Получено уравнение: " + inputString);
//         // Вывод результата
//         System.out.println(getSolution(inputString));
//     }

//     public static String getSolution(String str) {
//         // Формируем список. Резделитель - пробел, "+" и "=" исключаем
//         ArrayList<String> list = new ArrayList<>(List.of(str.split(" "))); list.remove("+"); list.remove("=");
//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 10; j++) {
//                 // Заменяем "?" в цикле от 0 до 9, сравниваем с результатом выражения
//                 int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
//                 int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
//                 if (x + y == Integer.parseInt(list.get(2))) {
//                     // Решение найдено, формируем строку ответа
//                     return String.format("Результат: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
//                 }
//             }
//         }
//         // Иначе решения нет
//         return "Нет решения";
//     }

//     public static String getDataFromFile(String path) {
//         try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//             return br.readLine();
//         } catch (Exception exception) {
//             System.out.println(exception.getMessage());
//             return "";
//         }
//     }

}






    




