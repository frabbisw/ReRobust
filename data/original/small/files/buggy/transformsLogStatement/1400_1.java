public int getRowCount() {
    System.out.println("log");
    return ((studio.kdb.K.KBaseVector) (dict.x)).getLength();
}
