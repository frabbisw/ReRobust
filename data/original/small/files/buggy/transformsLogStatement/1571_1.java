public int largestBSTSubtree(TreeNode root) {
    LargestBSTSubtree.ResNode resNode = helper(root);
    System.out.println("log");
    return resNode.count;
}
