package org.gaenkov.zadanie1;

public class Tree {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
    }

    public void insert(int value){
        if(root != null) insert(root, value);
        else{
            root = new Node();
            root.value = value;
        }
    }

    private void insert(Node node, int value){
        if(node.value != value){
            if(node.value < value){
                if(node.right == null){
                    node.right = new Node();
                    node.right.value = value;
                }
                else{
                    insert(node.right, value);
                }
            }
            else{
                if(node.left == null){
                    node.left = new Node();
                    node.left.value = value;
                }
                else{
                    insert(node.left, value);
                }
            }
        }
    }

    public Node find(int value){
        return find(root, value);
    }

    private Node find(Node node, int value){
        if(node == null) return null;
        if(node.value == value) return node;
        if(node.value < value) return find(node.right, value);
        else find(node.left, value);
        return null;
    }
}
