public class Main
{
    public static void main(String[] args)
    {



    }

    public class Tree
    {
        Node root;

        public boolean insert(int val)
        {
            if(root == null)
            {
                root = new Node(val);
                return true;
            }

            else return root.insert(val);
        }

        public boolean find(int val)
        {
            if(root == null)
            {
                return false;
            }
            else {return root.find(val);}
        }

        public int getHeight()
        {
            if(root != null)
            {
                return root.getHeight();
            }

            else
            {
                return 0;
            }
        }

        public  int getSize()
        {
            if(root != null)
            {
                return root.getSize();
            }

            else
                return 0;
        }

        public void preorder()
        {
            if (root != null) {
                System.out.println("Preorder: ");
                root.preorder();
            }
        }

        public void postorder() {
            if (root != null) {
                System.out.println("Postorder:");
                root.postorder();
            }
        }

        public void inorder() {
            if (root != null) {
                System.out.println("Inorder:");
                root.inorder();
            }
        }
    }

    private class Node
    {
        private Node left;
        private Node right;
        private int data;

        private Node(int value)
        {
            data = value;
            left = null;
            right = null;
        }

        private boolean insert(int val) {
            boolean added = false;
            if (this == null) {
                this.data = val;
                return true;
            }
            else {
                if (val < this.data) {
                    if (this.left == null) {
                        this.left = new Node(val);
                        return true;
                    }
                    else
                        added = this.left.insert(val);
                }
                else if (val > this.data) {
                    if (this.right == null) {
                        this.right = new Node(val);
                        return true;
                    }
                    else
                        added = this.right.insert(val);
                }
            }
            return added;
        }


        private boolean find(int val) {
            boolean found = false;
            if (this == null)
                return false;
            else {
                if (val == this.data)
                    return true;
                else if (val < this.data && this.left != null)
                    found = this.left.find(val);
                else if (val > this.data && this.right != null)
                    found = this.right.find(val);
            }
            return found;
        }

        private int getHeight() {
            int leftHeight = 0, rightHeight = 0;

            if (this.left != null)
                leftHeight = this.left.getHeight();

            if (this.right != null)
                rightHeight = this.right.getHeight();

            return 1 + Math.max(leftHeight, rightHeight);
        }

        private int getSize() {
            int leftSize = 0, rightSize = 0;

            if (this.left != null)
                leftSize = this.left.getSize();

            if (this.right != null)
                rightSize = this.right.getSize();

            return 1 + leftSize + rightSize;
        }

        private void preorder()
        {
            if (this != null) {
                System.out.println(this.data);
                if (this.left != null)
                    this.left.preorder();
                if (this.right != null)
                    this.right.preorder();
            }
        }

        private void postorder()
        {
            if (this != null) {
                System.out.println(this.data);
                if (this.left != null)
                    this.left.preorder();
                if (this.right != null)
                    this.right.preorder();
            }
        }

        private void inorder()
        {
            if (this != null) {
                if (this.left != null)
                    this.left.inorder();
                System.out.println(this.data);
                if (this.right != null)
                    this.right.inorder();
            }
        }








    }







}

