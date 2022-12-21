@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstance) {
    try {
        super.onSaveInstanceState(savedInstance);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (((listData) != null) || (listData.isEmpty())) {
        savedInstance.putSerializable("HEADER", listData);
    }
}
