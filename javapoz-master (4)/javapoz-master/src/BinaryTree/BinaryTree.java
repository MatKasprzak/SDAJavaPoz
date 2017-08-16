package BinaryTree;

/**
 * Created by RENT on 2017-08-16.
 */
public class BinaryTree {
    public static void main(String[] args) {

        Node firstNode = randomBinaryTree(6,10,0.5);
        System.out.println("Preorder");
        preorder(firstNode);
        System.out.println("Inorder");
        inorder(firstNode);
        System.out.println("Postorder");
        postorder(firstNode);
    }

    public static void preorder(Node node){
        if (node != null) {
            System.out.println(node.getKey());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }
    public static void inorder(Node node){
        if (node != null){
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }
    }

    public static void postorder(Node node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.println(node.getKey());
        }
    }

    // n - liczba elementów drzewa, z- zakres losowania, p - prawdopodbienstwo lewego podrrzewa, node - element drzewa
    public static Node randomBinaryTree(int n, int z, double p) {
        Node rootElement = new Node();
        rootElement.setKey((int)(Math.random() * z));

// i = 1 bo pierwszego Noda tworzymy automatycznie
        Node currentElement = rootElement;
        for (int i = 1; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey((int)(Math.random() * z));

            boolean added = false;
            do {
                if (Math.random() < p) {
                    if (currentElement.getLeft() == null) {
                        currentElement.setLeft(newElement);
                        added = true;
                    }else {
                        currentElement = currentElement.getLeft();
                    }
                    if (currentElement.getRight() == null) {
                        currentElement.setRight(newElement);
                        added = true;
                    }else {
                        currentElement = currentElement.getRight();
                    }
                }
                if(added) {
                    System.out.println(currentElement.toString());
                }
            } while (!added);

        }


        return rootElement;
    }

}
