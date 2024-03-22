package UT;

import Structures.S_List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class Insert_UT {

    @Test
    public void testInsertList()
    {
        S_List<Integer> list0= new S_List<Integer>();
        list0.addLast(11);

        S_List<Integer> list1= new S_List<Integer>();
        list0.addLast(51);

        list0.insertList(list1);

        Assertions.assertEquals(11,11);


    }
}
