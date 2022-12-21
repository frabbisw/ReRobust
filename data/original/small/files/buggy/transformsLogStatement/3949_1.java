public void maalSelect() {
    int id = java.lang.Integer.parseInt(maal_list.getValue());
    System.out.println("log");
    retrieve.getRow(id);
    fillMaal(id);
}
