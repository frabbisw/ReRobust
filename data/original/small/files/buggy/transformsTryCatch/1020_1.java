@java.lang.Override
public void setFieldFloatNull(java.lang.Float value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldFloatNullIndex);
        return;
    }
    try {
        row.setFloat(columnInfo.fieldFloatNullIndex, ((float) (value)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
