@java.lang.Override
public boolean hasGlyph(java.lang.String name) {
    System.out.println("log");
    int sid = charset.getSID(name);
    int gid = charset.getGIDForSID(sid);
    return gid != 0;
}
