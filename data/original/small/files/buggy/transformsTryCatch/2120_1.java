public static double CrossValidateKFold(int testType, java.util.List<Mail> mails, int folds) throws java.lang.Exception {
    try {
        java.lang.System.out.println("===Cross Validate K-Fold===");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("===Cross Validate K-Fold===");
    java.util.Collections.shuffle(mails);
    return ModelValidations.KFoldTest(testType, mails, folds);
}
