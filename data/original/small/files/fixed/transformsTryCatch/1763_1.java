public void checkErrorAndCast(com.developmentontheedge.beans.DynamicPropertySet dps) {
    try {
        isError(dps);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.developmentontheedge.beans.DynamicProperty property : dps) {
        checkErrorAndCast(property);
    }
}
