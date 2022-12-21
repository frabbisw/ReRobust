public boolean Term() {
    try {
        if (!((Var()) || (Int()))) {
            java.lang.System.out.println(("You are missing term " + (Int())));
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
