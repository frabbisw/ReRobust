private java.util.List<java.lang.String> getPrivateRoomOptions() {
    java.util.List<java.lang.String> options = new java.util.ArrayList<>();
    try {
        options.add("No");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    options.add("Yes");
    return options;
}
