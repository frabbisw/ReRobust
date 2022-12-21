public void addQualification() {
    if ((choosenQualifications) == null)
        choosenQualifications = new java.util.ArrayList<>();
    try {
        choosenQualifications.add(qualificationService.addQualification(school, degree));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
