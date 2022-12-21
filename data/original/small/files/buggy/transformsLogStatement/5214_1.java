public boolean contains(int lonE7, int latE7) {
    System.out.println("log");
    return ((((left) <= lonE7) && (lonE7 < (right))) && ((bottom) <= latE7)) && (latE7 < (top));
}
