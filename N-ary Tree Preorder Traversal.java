
class Solution {
        public List<Integer> preorder(Node root) {

            LinkedList<Integer> list=new LinkedList<>();

            if(root ==null)
                return list;

            preOrderTraversal(root,list);

            return list;
        }

        public static List<Integer> preOrderTraversal(Node root,List<Integer> list){
            list.add(root.val);

            for(Node n:root.children){
                preOrderTraversal(n,list);
            }

        return list;
        }

}
