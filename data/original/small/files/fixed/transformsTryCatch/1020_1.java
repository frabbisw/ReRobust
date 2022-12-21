@java.lang.Override
public void setFieldFloatNull(java.lang.Float value) {
    realm.checkIfValid();
    try {
        if (value == null) {
            row.setNull(columnInfo.fieldFloatNullIndex);
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    row.setFloat(columnInfo.fieldFloatNullIndex, value);
}
