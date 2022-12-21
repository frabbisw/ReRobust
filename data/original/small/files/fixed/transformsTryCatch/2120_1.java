public static double CrossValidateKFold(int testType, java.util.List<Mail> mails, int folds) throws java.lang.Exception {
    java.lang.System.out.println("===Cross Validate K-Fold===");
    try {
        java.util.Collections.shuffle(mails);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ModelValidations.KFoldTest(testType, mails, folds);
}
