public java.awt.Graphics create(int i, int i1, int i2, int i3) {
    try {
        if ((gc) != null)
            return gc.create(i, i1, i2, i3);
        else
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
