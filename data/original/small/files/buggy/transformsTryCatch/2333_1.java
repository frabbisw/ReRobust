public java.util.List<java.lang.String> getSavedData(java.lang.String type) {
    java.util.List<java.lang.String> handwritingList = new java.util.ArrayList<java.lang.String>();
    try {
        handwritingList = dataBaseHelper.getData(type);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return handwritingList;
}
