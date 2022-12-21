public double utility() {
    try {
        if ((visits) == 0)
            return putInBounds(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return putInBounds(score(0, root));
}
