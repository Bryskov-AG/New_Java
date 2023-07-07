import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class calculator {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        calc();
        
    }

    static void calc(){

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

            

        }
        System.out.printf("Результат: " + "%.2f",result);
        logStep("Вычисление: " + number_1 + " " + action + " " + number_2 + " = " + result);
    }

    public static void logStep(String note) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log, true); // Используем true для добавления записи в конец файла
            fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог-файл.");
        }
    }
}

   
