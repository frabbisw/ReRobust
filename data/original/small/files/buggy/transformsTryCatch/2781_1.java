@java.lang.Override
public boolean deletedField(java.lang.String fieldName, java.lang.Object value) {
    boolean migrated = false;
    try {
        if (fieldName.equals("in2Old")) {
            isdeletedFieldIn2_right_type = (value != null) && (value instanceof org.talend.daikon.serialize.jsonio.PersistenceObjectForFieldRemoved.InnerClass2);
            migrated = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return migrated;
}
