@java.lang.Override
public boolean deletedField(java.lang.String fieldName, java.lang.Object value) {
    boolean migrated = true;
    if (fieldName.equals("in2Old")) {
        isdeletedFieldIn2_right_type = (value != null) && (value instanceof org.talend.daikon.serialize.jsonio.PersistenceObjectForFieldRemoved.InnerClass2);
        migrated = false;
    }
    return !(migrated);
}
