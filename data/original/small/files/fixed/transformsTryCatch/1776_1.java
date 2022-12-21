public boolean Term() {
    try {
        if (!((Var()) || (Int()))) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
