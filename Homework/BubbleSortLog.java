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
