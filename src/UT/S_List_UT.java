package UT;

import Iterator.S_List_Iterator;
import Structures.S_List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class S_List_UT
{
    //Probando función de InsertarLista

    @Test
    public void testLowerMerge()
    {
        S_List<Integer> list0= new S_List<Integer>();
        list0.addLast(1);
        list0.addLast(2);
        list0.addLast(3);
        list0.addLast(4);

        S_List<Integer> list1= new S_List<Integer>();
        list0.addLast(5);
        list0.addLast(6);
        list0.addLast(7);
        list0.addLast(8);

        list0.insertList(list1);

        S_List_Iterator<Integer> iterator = new S_List_Iterator<>(list0);

        Assertions.assertEquals(1,iterator.getNext());
        Assertions.assertEquals(2,iterator.getNext());
        Assertions.assertEquals(3,iterator.getNext());
        Assertions.assertEquals(4,iterator.getNext());

        Assertions.assertEquals(5,iterator.getNext());
        Assertions.assertEquals(6,iterator.getNext());
        Assertions.assertEquals(7,iterator.getNext());
        Assertions.assertEquals(8,iterator.getNext());
    }

    @Test
    public void testUpperMerge()
    {
        S_List<Integer> list0= new S_List<Integer>();
        list0.addLast(1);
        list0.addLast(2);
        list0.addLast(3);
        list0.addLast(4);

        S_List<Integer> list1= new S_List<Integer>();
        list0.addLast(5);
        list0.addLast(6);
        list0.addLast(7);
        list0.addLast(8);

        list0.insertList(list1);

        S_List_Iterator<Integer> iterator = new S_List_Iterator<>(list0);

        for(int i=0; i<4;i++)
        {
            iterator.getNext();
        }

        Assertions.assertEquals(5,iterator.getNext());
        Assertions.assertEquals(6,iterator.getNext());
        Assertions.assertEquals(7,iterator.getNext());
        Assertions.assertEquals(8,iterator.getNext());
    }

    @Test
    public void testMergeLength()
    {
        S_List<Integer> list0= new S_List<Integer>();
        list0.addLast(1);
        list0.addLast(2);
        list0.addLast(3);
        list0.addLast(4);

        S_List<Integer> list1= new S_List<Integer>();
        list0.addLast(5);
        list0.addLast(6);
        list0.addLast(7);
        list0.addLast(8);

        list0.insertList(list1);

        Assertions.assertEquals(8,list0.getLength());
    }

}
