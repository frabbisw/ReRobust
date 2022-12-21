public java.math.BigDecimal rawAverage(org.fenixedu.academic.domain.student.curriculum.Curriculum curriculum) {
    try {
        if ((sumPiCi) == null) {
            doCalculus(curriculum);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return calculateAverage();
}
