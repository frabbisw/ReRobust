@java.lang.Override
public void insert(long startFrom, org.exbin.utils.binary_data.BinaryData insertedData) {
    long dataSize = insertedData.getDataSize();
    insertUninitialized(startFrom, dataSize);
    try {
        replace(startFrom, insertedData, 0, dataSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
