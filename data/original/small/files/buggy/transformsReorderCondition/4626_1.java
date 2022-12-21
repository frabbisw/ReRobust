private int getPosition(int position) {
    if (4 < position) {
        return position - ((int) (java.lang.Math.ceil((position / 4))));
    } else {
        return position;
    }
}
