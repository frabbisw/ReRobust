public boolean contains(int lonE7, int latE7) {
    return (latE7 < (top)) && ((((left) <= lonE7) && (lonE7 < (right))) && ((bottom) <= latE7));
}
