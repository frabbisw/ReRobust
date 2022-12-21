public java.lang.String asString() {
    byte[] bytes = asBytes();
    return bytes != null ? new java.lang.String(asBytes()) : null;
}
