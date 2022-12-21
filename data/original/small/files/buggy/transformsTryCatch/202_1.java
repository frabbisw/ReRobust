public boolean stillToDo() {
    try {
        if (!(isThereAvailableMove()))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isThereNothing()) {
        return true;
    }
    if (isThereAnythingToErase()) {
        return true;
    }
    return false;
}
