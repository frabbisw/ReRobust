public void printList(java.util.List valueList) {
    try {
        for (java.lang.Object value : valueList) {
            value.toString();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
