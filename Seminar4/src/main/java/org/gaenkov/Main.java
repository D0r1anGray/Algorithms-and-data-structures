package org.gaenkov;

import org.gaenkov.zadanie1.Tree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
//        Random rnd = new Random();
        for(int i = 1; i <=6; i++){
            tree.insert(i);
        }

//        System.out.println(tree.find(1));
//        System.out.println(tree.find(6));
    }
}