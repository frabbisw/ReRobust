private int getPosition(int position) {
    try {
        if (position > 4) {
            return position - ((int) (java.lang.Math.ceil((position / 4))));
        } else {
            return position;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
