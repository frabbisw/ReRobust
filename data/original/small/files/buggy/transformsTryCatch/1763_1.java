public void checkErrorAndCast(com.developmentontheedge.beans.DynamicPropertySet dps) {
    try {
        for (com.developmentontheedge.beans.DynamicProperty property : dps) {
            if (isError(property))
                throw new java.lang.IllegalArgumentException();
            checkErrorAndCast(property);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
