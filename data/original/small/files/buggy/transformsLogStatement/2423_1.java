public java.math.BigDecimal rawAverage(org.fenixedu.academic.domain.student.curriculum.Curriculum curriculum) {
    if ((sumPiCi) == null) {
        doCalculus(curriculum);
    }
    System.out.println("log");
    return calculateAverage();
}
