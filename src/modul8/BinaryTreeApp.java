package modul8;
public class BinaryTreeApp {
     public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        
        Treenode node;
        
        node = new Treenode('D');
        tree.insert(node);
        
        node = new Treenode('B');
        tree.insert(node);
        
        node = new Treenode('A');
        tree.insert(node);
        
        node = new Treenode('C');
        tree.insert(node);
        
        node = new Treenode('F');
        tree.insert(node);
        
        node = new Treenode('E');
        tree.insert(node);
        
        node = new Treenode('G');
        tree.insert(node);
        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
    }
}

