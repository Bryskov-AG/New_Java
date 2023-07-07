package Homework;

import java.io.FileWriter;
import java.io.IOException;

public class BubbleSortLog {

    private static FileWriter logWriter;

    public static void main(String[] args) {
        try {
            logWriter = new FileWriter("log.txt");
            int[] arr = {5, 2, 8, 1, 9, 23, 54, 7, 14, 25, 15, 4, 17};
            bubbleSort(arr);
            
            // Вывод отсортированного массива
            System.out.println("Отсортированный массив: ");
            printArray(arr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (logWriter != null) {
                    logWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void bubbleSort(int[] arr) throws IOException {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Запись текущего состояния массива в лог-файл
            writeLog(arr);
            
            // Если внутренний цикл не выполнил ни одного обмена, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void writeLog(int[] arr) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        sb.append("\n");
        
        logWriter.write(sb.toString());
        logWriter.flush();
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
// =============================================================================
/**
 * [3] Дана json строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
// class ParseJSON {
// private static final String JSON =
//         "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\", \"предмет\":\"Математика\"}," +
//                 "{\"фамилия\" : \"Петрова\" ,\"оценка\" :\"4\" ,\"предмет\" : \"Информатика\"}," +
//                 "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
// private static final String ELEMENT1 = "Студент ";
// private static final String ELEMENT2 = " получил ";
// private static final String ELEMENT3 = " по предмету ";

// public static void main(String[] args) {

//     StringBuilder sb = new StringBuilder();

//     String newJSON = JSON
//             .replaceAll("\\{", "")
//             .replaceAll("\\}", "")
//             .replace("\"", "")
//             .replace("[", " ")
//             .replace("]", " ");
//     System.out.println(newJSON);
//     String[] parts = newJSON.split(",");
//     for (String part : parts) {
//         String[] params = part.split(":");
//         if ("фамилия".equals(params[0].trim())) {
//             sb = new StringBuilder(ELEMENT1)
//                     .append(params[1]);
//         } else if ("оценка".equals(params[0].trim()))
//             sb.append(ELEMENT2)
//                     .append(params[1]);
//         else if ("предмет".equals(params[0].trim())) {
//             sb.append(ELEMENT3).append(params[1]);
//             System.out.println(sb);
//         }
//     }
// }
// }
// =========================================================================
/**
 * [4*] К калькулятору из предыдущего дз добавить логирование.
 */
// class Calculator {
//     private static File log;
//     private static FileWriter fileWriter;
//     /**
//      * [3*] Реализовать простой калькулятор
//      * @param args аргументы командной строки
//      */
//     public static void main(String[] args) throws IOException {
//         try {
//             log = new File("log.txt");
//             log.createNewFile();
//             fileWriter = new FileWriter(log);
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Введите первое число: ");
//             int a = scanner.nextInt();
//             System.out.print("Введите операцию (+ - * /): ");
//             char op = scanner.next().charAt(0);
//             System.out.print("Введите второе число: ");
//             int b = scanner.nextInt();
//             int res;
//             switch (op) {
//                 case '+':
//                     res = add(a, b);
//                     logStep("Result is: " + res);
//                     System.out.println(a + " + " + b + " = " + res);

//                     break;
//                 case '-':
//                     res = minus(a, b);
//                     logStep("Result is: " + res);
//                     System.out.println(a + " - " + b + " = " + res);
//                     break;
//                 case '*':
//                     res = multi(a, b);
//                     logStep("Result is: " + res);
//                     System.out.println(a + " * " + b + " = " + res);
//                     break;
//                 case '/':
//                     res = divide(a, b);
//                     logStep("Result is: " + res);
//                     System.out.println(a + " / " + b + " = " + res);
//                     break;
//                 default:
//                     logStep("Wrong operation!");
//                     System.out.println("Wrong operation!");
//                     break;
//             }
//         }
//         finally {
//             fileWriter.close();
//         }
//     }

//     private static int divide(int a, int b) {
//         if (b != 0) return a / b;
//         return -1;
//     }

//     private static int multi(int a, int b) {
//         return a * b;
//     }

//     private static int minus(int a, int b) {
//         return a - b;
//     }

//     private static int add(int a, int b) {
//         return a + b;
//     }

//     public static void logStep(String note) throws IOException {
//         fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
//     }

// }