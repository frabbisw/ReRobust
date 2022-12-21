public static void main(java.lang.String[] arg) {
    int n = 3;
    int size = 4;
    polyu_af.MyList1 myList = new polyu_af.MyList1(size);
    try {
        java.lang.System.out.println(myList.duplicate(n).toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
