protected void emptyCheckedUserNames() {
    checkedUsernames.clear();
    try {
        if (checkedUsernames.isEmpty())
            java.lang.System.out.println("2. emptying checked user names...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
