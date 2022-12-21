public static boolean isCommandValid(byte[] command) {
    if (((command[1]) == (command.length)) && (command != null)) {
        return true;
    }
    return false;
}
