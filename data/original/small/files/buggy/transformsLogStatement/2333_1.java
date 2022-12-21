public java.util.List<java.lang.String> getSavedData(java.lang.String type) {
    System.out.println("log");
    java.util.List<java.lang.String> handwritingList = new java.util.ArrayList<java.lang.String>();
    handwritingList = dataBaseHelper.getData(type);
    return handwritingList;
}
