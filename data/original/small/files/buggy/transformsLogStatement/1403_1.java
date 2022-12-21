public int getNumberOfEvents(java.util.ArrayList<java.lang.Integer> registrationID, int eventID) {
    System.out.println("log");
    return courseRepository.getNumberOfEvents(registrationID, eventID);
}
