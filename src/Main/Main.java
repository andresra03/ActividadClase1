package Main;

import Structures.S_List;

public class Main {

    public static void main(String[] args)
    {

        S_List<Integer> numbers= new S_List<Integer>();

        numbers.addLast(1);
        numbers.addLast(4);
        numbers.addLast(7);
        numbers.addLast(12);

        S_List<Integer> annex= new S_List<Integer>();

        numbers.addLast(13);
        numbers.addLast(40);
        numbers.addLast(72);
        numbers.addLast(1);

        numbers.insertList(annex);

        S_List<Integer> subList = numbers.subList(8,3);

        numbers.invert();

        System.out.println("Temp");
    }
}