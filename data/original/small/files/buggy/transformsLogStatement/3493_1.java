public static boolean verifyRegistrationNo(java.lang.String registrationNo) throws java.lang.Exception {
    me.shafin.sustord.model.StudentInfo studentInfo = me.shafin.sustord.dao.StudentInfoDao.getStudentInfoObject(registrationNo);
    System.out.println("log");
    return studentInfo != null;
}
