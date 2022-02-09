package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LambdaDemo {
    public static void main(String[] args) {

        FunctionalDemo fd = () -> {
            Game g=new Game();
            g.test2();
            int n1=10;
            int n2=20;
            System.out.println(n1+n2+" lambda test called");
        };

        fd.test1();

        List<String> gamescollection=new ArrayList<>();
        gamescollection.add("GTA");
        gamescollection.add("NFS");
        gamescollection.add("God Of War");
        gamescollection.add("Kill Bill");
        gamescollection.forEach(games -> { System.out.println(games);});
        Iterator<String> l=gamescollection.listIterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
    }
}
