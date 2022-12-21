public boolean Term() {
    if (!((Int()) || (Var()))) {
        java.lang.System.out.println(("You are missing term " + (Int())));
        return false;
    }
    return true;
}
