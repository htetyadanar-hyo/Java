package DataStructure;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {25,12,36,4,15,30,45,2,10,13,16,29,34,40,65};
        for(int item: arr){
            bst.insert(item );
        }
        String result = bst.search(bst.root, 8) != null ? "Found" : "Not Found";
        System.out.println("Search result: " + result);
        System.out.println("InOrder: ");
        bst.inOrderTraverse(bst.root);
        System.out.println();
        System.out.println("PreOrder: ");
        bst.preOrderTraverse(bst.root);
        System.out.println();
        System.out.println("PostOrder: ");
        bst.postOrderTraverse(bst.root);
        bst.root = bst.deleteNode(bst.root, 25); //Assign pyan cha mha delete twr mal
        System.out.println("InOrder: ");
        bst.inOrderTraverse(bst.root);
        System.out.println("PreOrder: ");
        bst.preOrderTraverse(bst.root);
        System.out.println();
    }
}
