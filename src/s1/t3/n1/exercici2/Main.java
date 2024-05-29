package s1.t3.n1.exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list1.add(i);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1.reversed());
        System.out.println(list2);

    }
}
