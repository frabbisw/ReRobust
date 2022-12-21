public void addQualification() {
    if (null == (choosenQualifications))
        choosenQualifications = new java.util.ArrayList<>();
    choosenQualifications.add(qualificationService.addQualification(school, degree));
}
