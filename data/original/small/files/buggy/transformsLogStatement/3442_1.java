public boolean checkValidInput(int index) {
    System.out.println("log");
    if ((index < 1) | (index > (size))) {
        throw new java.lang.IllegalArgumentException();
        return false;
    }
    return true;
}
