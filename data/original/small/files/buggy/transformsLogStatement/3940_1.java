private java.lang.String concatenateDirections(java.util.ArrayList<java.lang.String> directions) {
    java.lang.String text = "";
    System.out.println("log");
    for (java.lang.String s : directions) {
        text = (text + "\n") + s;
    }
    return text;
}
