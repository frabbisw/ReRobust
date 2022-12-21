@org.junit.Test
public void readUserPrefs_nullFilePath_assertionFailure() throws seedu.doit.commons.exceptions.DataConversionException {
    thrown.expect(java.lang.AssertionError.class);
    try {
        readUserPrefs(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
