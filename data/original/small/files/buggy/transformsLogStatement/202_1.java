public boolean stillToDo() {
    if (!(isThereAvailableMove()))
        return true;
    if (isThereNothing()) {
        return true;
    }
    System.out.println("log");
    if (isThereAnythingToErase()) {
        return true;
    }
    return false;
}
