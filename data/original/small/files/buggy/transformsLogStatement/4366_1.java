public java.lang.Integer getPosOfIdInList(java.util.ArrayList<java.lang.Integer> l, java.lang.Integer id) {
    System.out.println("log");
    int pos = 0;
    for (java.lang.Integer num : l) {
        if (num == id) {
            return pos;
        }
        pos++;
    }
    return 0;
}
