@org.junit.Before
public void setUp() throws java.lang.Exception {
    azureStorageUtils = new org.talend.components.azurestorage.utils.AzureStorageUtils();
    folder = (TEST_FOLDER_PUT) + (getClass().getResource("/").getPath());
}
