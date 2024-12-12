class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(root,curr,result);
        return result;
    }
    public static void helper(Node root , List curr,ArrayList result){
        if(root==null){
            return;
        }
        curr.add(root.data);
        if(root.left==null && root.right==null){
            result.add(new ArrayList<>(curr));
        }
        if(root.left!=null){
            helper(root.left,curr,result);
        }
        if(root.right!=null){
            helper(root.right,curr,result);
        }
        curr.remove(curr.size()-1);
        return;
    }
}