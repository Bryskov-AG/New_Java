package seminar_1;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean f = true;
        while(f){
            System.out.println("Укажите номер интересующей Вас задачи: ");
            System.out.println("1-Task1");
            System.out.println("2-Task2");
            System.out.println("3-Task3");
            System.out.println("0-Завершение работы приложения");
            System.out.println("==========================================");
            int no = Integer.parseInt(scanner.nextLine());

            switch(no){

                case 1:
                    task1();
                    break;

                case 2:
                    task2();
                    break;

                case 3:
                    task3("Добро пожаловать на курс по Java");
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
    // Написать программу,которая запросит пользователя ввести <имя> в консоли
    // Получит введённую строку и выведет в консоль сообщение "Привет, <имя>!"

    static void task1(){
       //  Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя : ");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name + "!");      // один вариант вывода
        // System.out.printf("Привет, %s!" , name);  //  ("Привет, %s! %d %f ,name ,i ,j")   %-переменная,можно несколько.  %s-строка  %d-целые числа  %f-числа с плавающей точкой
                                                         // %.2s-2 символа строки    %.2f-2 символа после запятой
    }
    // Дан массив двоичных чисел,например[1,1,0,1,1,1,0,1] 
    // вывести максимальное количество подряд идущих 1

    static void task2(){    //  task2(int[] inputArray)
        

        int[] array2 = {1,1,0,1,1,1,0,1,1,1,1};   // удаляем строку
        int max = 0;
        int counter = 0;

        for(int e : array2){   // aaray2 = inputArray
            if (e == 1){
                counter++;
            }
            else{
                if (counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter > max)
            max = counter;
        System.out.printf("Максимальное кол-во идущих подряд единиц: %d\n" ,max);
    }

    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке

    static void task3(String str){
        String[] words = str.split(" ");

        for (int i = words.length-1;i >= 0;i--){
            // System.out.print(words[i] + " ");
            System.out.printf("%s ", words[i]);
        }
        System.out.println();


    }




}