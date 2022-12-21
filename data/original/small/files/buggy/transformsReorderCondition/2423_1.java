public java.math.BigDecimal rawAverage(org.fenixedu.academic.domain.student.curriculum.Curriculum curriculum) {
    if (null == (sumPiCi)) {
        doCalculus(curriculum);
    }
    return calculateAverage();
}
