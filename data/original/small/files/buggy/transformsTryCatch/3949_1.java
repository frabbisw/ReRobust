public void maalSelect() {
    int id = java.lang.Integer.parseInt(maal_list.getValue());
    try {
        retrieve.getRow(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fillMaal(id);
}
