public void maalSelect() {
    try {
        if ((maal_list.getValue()) != null) {
            int id = java.lang.Integer.parseInt(maal_list.getValue());
            retrieve.getRow(id);
            fillMaal(id);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
