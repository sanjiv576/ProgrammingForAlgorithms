public class BinarySearchTree {
    
    // blue print 
    public static class Node {


        //  for left side
        Node left;
        Node right;
        // type depends on scenario like String, Linked list, array 
        int data;

        Node (int data){
            this.data = data;
            left = right = null;
        }


        // create binary search tree

        public Node createBST(int data, Node rootNode){

            if(rootNode == null){
                // if inserting for the first time, if rootnode is present , create new node
                return new Node(data);
            }

            // comparision with data to move left or right side
            if(data<rootNode.data){

                // visit left side
                rootNode.left = createBST(data, rootNode.left);
            }

            else {
                // visit right side
                // 100.right = createBST(11, null)
                rootNode.right = createBST(data, rootNode.right);
                // after executing this , rootNode.left = 200 (new nOde of new data)
            }
            return rootNode;
        }


        public Node searchBST(int data, Node rootNode){

            // if element found
            if(rootNode.data == data){

                return rootNode;
                
            }

            // if not found search on left side
            if(data<rootNode.data){

                
                rootNode.left = searchBST(data, rootNode.left);
                
            }

            // search on right side
            else {
                
                rootNode.right = searchBST(data, rootNode.right);
            }
            return null;
        }


        // left root right
        public void inorder(Node rootNode){

            if(rootNode == null){
                return;
            }

            // visit left sub tree
            inorder(rootNode.left);
            System.out.print(rootNode.data + " ");

            // visit right sub tree
            inorder(rootNode.right);
            
        }

        
    }
    public static void main(String[] args){
        BinarySearchTree b = new BinarySearchTree();
        Node rootNode = b.createBST(10, null);
        rootNode = b.createBST(20, rootNode);
    }
}
