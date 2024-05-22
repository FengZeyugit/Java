public class BinarySearchTree {

    static class TreeNode {

        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {

            this.val = val;
        }
    }


    public TreeNode root = null;



    public TreeNode search(int key) {
        TreeNode cur = root;
        while(cur != null) {

            if(cur.val == key) {
                return cur;
            }else if(cur.val < key) {

                cur = cur.right;
            }else {

                cur = cur.left;
            }


        }

        return null;

    }



    public void insert(int val) {

        TreeNode node = new TreeNode(val);
        if(root == null) {
            root = node;
            return;
        }
        TreeNode cur = root;
        TreeNode parent = null;

        while(cur != null) {
            if(cur.val < val) {

                parent = cur;
                cur = cur.right;
            }else if (cur.val > val) {

                parent = cur;
                cur = cur.left;
            }else {
                return;
            }

        }

        //parent指向的节点就是需要插入的节点位置的父亲节点
        if(parent.val > val) {
            parent.left = node;
        }else {
            parent.right = node;
        }
    }


    public void remove(int key) {
        TreeNode parent = null;
        TreeNode cur = root;
        while(cur != null) {
            if(cur.val < key) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val > key) {
                parent = cur;
                cur = cur.left;
            }else {
                removeNode(parent,cur);
                return;
            }
        }



    }

    //删除指定节点的过程    cur表示待删除的节点，parent表示待删除节点的父亲节点
    private void removeNode(TreeNode parent,TreeNode cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }



        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }



        }else {
            //找到cur右树的最小值/左树的最大值替换cur.val，然后再删除cur右树的最小值/左树的最大值（替换法）
            TreeNode target = cur.right;
            TreeNode targetP = cur;
            while(target.left != null) {
                targetP = target;
                target = target.left;
            }
            cur.val = target.val;
            //删除cur右树的最小值/左树的最大值
            if(target == targetP.left) {
                targetP.left = target.right;
            }else {
                targetP.right = target.right;
            }
        }
    }
}
