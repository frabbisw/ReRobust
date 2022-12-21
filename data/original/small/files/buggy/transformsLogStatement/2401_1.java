public java.lang.String asString() {
    System.out.println("log");
    byte[] bytes = asBytes();
    return null != bytes ? new java.lang.String(asBytes()) : null;
}
