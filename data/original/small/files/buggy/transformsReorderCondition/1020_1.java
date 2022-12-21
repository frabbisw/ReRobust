@java.lang.Override
public void setFieldFloatNull(java.lang.Float value) {
    realm.checkIfValid();
    if (null == value) {
        row.setNull(columnInfo.fieldFloatNullIndex);
        return;
    }
    row.setFloat(columnInfo.fieldFloatNullIndex, ((float) (value)));
}
