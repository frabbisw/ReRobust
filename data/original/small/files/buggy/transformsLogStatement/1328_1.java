@java.lang.Override
public void insert(long startFrom, org.exbin.utils.binary_data.BinaryData insertedData) {
    System.out.println("log");
    long dataSize = insertedData.getDataSize();
    insertUninitialized(startFrom, dataSize);
    replace(startFrom, insertedData, 0, dataSize);
}
