public java.lang.Integer getPosOfIdInList(java.util.ArrayList<java.lang.Integer> l, java.lang.Integer id) {
    int pos = 0;
    for (java.lang.Integer num : l) {
        if (id == num) {
            return pos;
        }
        pos++;
    }
    return 0;
}
