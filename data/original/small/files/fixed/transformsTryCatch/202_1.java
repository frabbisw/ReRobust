public boolean stillToDo() {
    if (!(isThereAvailableMove()))
        return true;
    try {
        if (isThereNothing()) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
