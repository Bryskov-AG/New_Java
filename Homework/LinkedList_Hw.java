package Homework;
import java.util.Arrays;
import java.util.LinkedList;


public class LinkedList_Hw {

    public static LinkedList<Integer> reversList(LinkedList<Integer> listLinked) {
        LinkedList<Integer> listResult = new LinkedList<>();
        for (int element : listLinked) {
            listResult.addFirst(element);            
        }
        return listResult;
    }
    

    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(listNumbers.toString());
        System.out.println(reversList(listNumbers).toString());
    }
}

