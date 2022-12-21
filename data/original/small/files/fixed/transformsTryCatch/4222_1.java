public boolean straight() {
    try {
        if (inOrder(myCards)) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
