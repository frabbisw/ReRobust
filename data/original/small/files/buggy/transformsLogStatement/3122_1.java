public void addQualification() {
    System.out.println("log");
    if ((choosenQualifications) == null)
        choosenQualifications = new java.util.ArrayList<>();
    choosenQualifications.add(qualificationService.addQualification(school, degree));
}
