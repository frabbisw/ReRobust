public java.lang.String getString(java.lang.String encoding) {
    System.out.println("log");
    return play.libs.IO.readContentAsString(getStream(), encoding);
}
