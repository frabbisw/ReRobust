public java.util.List<java.lang.String> getPrivateRoomOptions() {
    java.util.List<java.lang.String> options = new java.util.ArrayList<>();
    options.add("No");
    try {
        options.add("Yes");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return options;
}
