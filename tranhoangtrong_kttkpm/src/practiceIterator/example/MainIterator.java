package practiceIterator.example;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("Iterator 63CNTT: ");
        ArrayCollection arrayCollection = new ArrayCollection();

        Iterator63 iterator63 = arrayCollection.createIterator();
        while(!(iterator63.isDone())){
            System.out.println(iterator63.next());
        }
    }

}
