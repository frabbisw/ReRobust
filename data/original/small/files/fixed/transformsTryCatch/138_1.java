@org.junit.Test
public void readUserPrefs_nullFilePath_assertionFailure() throws seedu.doit.commons.exceptions.DataConversionException {
    try {
        this.thrown.expect(java.lang.AssertionError.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    readUserPrefs(null);
}
