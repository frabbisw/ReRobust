public void printList(java.util.List valueList) {
    try {
        for (java.lang.Object value : valueList) {
            java.lang.System.out.println(value.toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
