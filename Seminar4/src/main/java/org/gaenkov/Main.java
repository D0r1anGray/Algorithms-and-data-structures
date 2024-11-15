package org.gaenkov;

import org.gaenkov.homework.Tree;
import org.gaenkov.zadanie1.HashMap;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Random rnd = new Random();
        for(int i = 1; i <=6; i++){
            tree.insert(i);
        }

        System.out.println(tree.find(1));
        System.out.println(tree.find(6));

//        HashMap map = new HashMap();
//        map.push(1, 20);
//        map.push(3, 40);
//
//        System.out.println(map.find(1));
//        System.out.println(map.find(2));
//
//        map.remove(1);
//        map.push(2, 50);
//
//        System.out.println(map.find(1));
//        System.out.println(map.find(2));
    }
}