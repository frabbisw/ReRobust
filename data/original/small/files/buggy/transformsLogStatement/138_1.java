@org.junit.Test
public void readUserPrefs_nullFilePath_assertionFailure() throws seedu.doit.commons.exceptions.DataConversionException {
    System.out.println("log");
    thrown.expect(java.lang.AssertionError.class);
    readUserPrefs(null);
}
