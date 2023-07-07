package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        task1();
        // task2();
        


    }

    static Random random = new Random();
    static ArrayList<ArrayList<String>> catalog = new ArrayList<>();


    /**
     * Задача:
     * Каталог товаров книжного магазина сохранен в виде двумерного
     * списка ArrayList<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
     * содержится название жанра, а на остальных позициях - названия книг.
     * Напишите метод для заполнения данной структуры.
     */
    static void task2(){
        addBook("Поэма", "Книга #1");
        addBook("Поэма", "Книга #2");
        addBook("Поэма", "Книга #3");
        addBook("Поэма", "Книга #4");
        addBook("Пьеса", "Книга #10");
        addBook("Пьеса", "Книга #15");
        printCatalog();
    }

    static void printCatalog(){
        int i = 0;
        boolean f = true;
        while (f){
            f = false;
            for(ArrayList<String> books : catalog){
                if (books != null && books.size() > i){
                    f = true;
                    System.out.printf("%s\t\t", books.get(i));
                }
            }
            System.out.println();
            i++;
        }
    }

    static void addBook(String genre, String bookName){
        for(ArrayList<String> books : catalog){
            if (books != null && books.size() > 0 && books.get(0).equals(genre)){
                books.add(bookName);
                return;
            }
        }
        ArrayList<String> books = new ArrayList<>();
        books.add(genre);
        books.add(bookName);
        catalog.add(books);
    }


    /**
     * Задача:
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */
    static void task1(){
        int size = random.nextInt(10, 21);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(-9, 10));
        }
        System.out.println("До сортировки: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("После сортировки: " + arrayList);
    }
}
