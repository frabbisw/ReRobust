public double utility() {
    if (0 == (visits))
        return putInBounds(1);
    return putInBounds(score(0, root));
}
