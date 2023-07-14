package Lots_of_cats;

import java.util.HashSet;


// Задание:
// 1.Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2.Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3.Создайте метод

// public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// Создайте метод

// public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

public class Main {

    public static void main(String[] args) {
        // Создаем множество для хранения экземпляров класса Cat
        HashSet<Cat> catSet = new HashSet<>();

        // Создаем несколько котов и добавляем их во множество
        Cat cat1 = new Cat("Арамис", 3);
        Cat cat2 = new Cat("Барсик", 5);
        Cat cat3 = new Cat("Зингер", 3); 
        Cat cat4 = new Cat("Мурзик", 4);
        Cat cat5 = new Cat("Тишка", 5);
        Cat cat6 = new Cat("Мурзик", 2);
        Cat cat7 = new Cat("Мурзик", 4);

       

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);
        catSet.add(cat6);
        catSet.add(cat7);

        System.out.println("=======================================");

        int expectedSize = 6; // Ожидаемое количество уникальных котов

        if (catSet.size() == expectedSize) {
            System.out.println("Все коты были сохранены во множество.");
        } else {
            System.out.println("Количество котов в множестве не соответствует ожидаемому.");
        }


        // Выводим содержимое множества (дубликаты будут автоматически удалены)
        for (Cat cat : catSet) {
            System.out.println(cat.getName() + ", " + cat.getAge());
        }

        

    }
    
}
