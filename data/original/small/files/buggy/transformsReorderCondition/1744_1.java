public boolean uncover() {
    if (uncovered)
        return false;
    uncovered = true;
    return ((count) == 0) && (!(marked));
}
