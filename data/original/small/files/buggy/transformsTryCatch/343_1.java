public void checkID(java.lang.String studentID) {
    java.lang.System.out.println(studentID);
    try {
        if (aGradeSystem.containsID(studentID)) {
            showWelcomeMsg();
            userID = studentID;
            promptCommand();
        } else {
            showErrorMsg();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
