public class Main
{
    public static void main(String[] args)
    {



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

        
    }







}

