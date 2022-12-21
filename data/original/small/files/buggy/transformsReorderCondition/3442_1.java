public boolean checkValidInput(int index) {
    if ((1 > index) | (index > (size))) {
        throw new java.lang.IllegalArgumentException();
        return false;
    }
    return true;
}
