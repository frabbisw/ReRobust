public static void main(java.lang.String[] args) throws java.lang.CloneNotSupportedException {
    RootedTree tree1 = new RootedTree(10000);
    RootedTree tree2 = new RootedTree(10000);
    try {
        java.lang.System.out.println(AHUalgorithm.getResult(tree1, tree2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
