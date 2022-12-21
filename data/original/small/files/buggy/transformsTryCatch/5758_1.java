public boolean addTestExecution(de.fhbingen.wbs.dbaccess.data.TestExecution te) {
    te.setEmployeeLogin(de.fhbingen.wbs.translation.LocalizedStrings.getLogin().login());
    boolean result = de.fhbingen.wbs.dbaccess.DBModelManager.getTestExecutionModel().addNewTestExecution(te);
    try {
        de.fhbingen.wbs.dbaccess.repositories.TestCaseExecutionRepository.reloadCache();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
