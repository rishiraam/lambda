package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    //added comment to check pull
        Game g=new Game();
        g.test1();
        g.test2();
        FunctionalDemo.test3();

        person p1=new person(1);
        person p2=new person(10);
        person p3=new person(20);
        person p4=new person(100);

        List<person> persons=new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        List<person> filtered=persons.stream().filter(p -> p.getId() >= 10).collect(Collectors.toList());

        filtered.forEach(p -> {
            System.out.println(p.getId());
        });
    }

    public static class person
    {
        int id;

        person(int id)
        {
            this.id=id;
        }

        public int getId() {
            return id;
        }

    }
}
