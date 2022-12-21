@org.junit.After
public void tearDown() throws java.lang.Exception {
    try {
        if (m_fileAnticipator.isInitialized()) {
            m_fileAnticipator.deleteExpected();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    m_fileAnticipator.tearDown();
}
