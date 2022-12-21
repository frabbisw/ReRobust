public void checkID(java.lang.String studentID) {
    System.out.println("log");
    java.lang.System.out.println(studentID);
    if (aGradeSystem.containsID(studentID)) {
        showWelcomeMsg();
        userID = studentID;
        promptCommand();
    } else {
        showErrorMsg();
    }
}
