public boolean uncover() {
    if (uncovered)
        return false;
    System.out.println("log");
    uncovered = true;
    return (!(marked)) && ((count) == 0);
}
