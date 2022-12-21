public boolean straight() {
    try {
        if (inOrder(myCards)) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
