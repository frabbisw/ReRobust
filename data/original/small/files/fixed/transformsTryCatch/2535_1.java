@org.junit.Before
public void setUp() throws java.lang.Exception {
    azureStorageUtils = new org.talend.components.azurestorage.utils.AzureStorageUtils();
    try {
        folder = getClass().getResource("/").getPath();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
