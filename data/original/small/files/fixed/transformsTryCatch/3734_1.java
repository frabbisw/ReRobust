private boolean checkMessage(java.lang.String input) {
    try {
        if ((input.equals(null)) || (input.trim().equals("")))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
