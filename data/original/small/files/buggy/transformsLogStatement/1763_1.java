public void checkErrorAndCast(com.developmentontheedge.beans.DynamicPropertySet dps) {
    System.out.println("log");
    for (com.developmentontheedge.beans.DynamicProperty property : dps) {
        if (isError(property))
            throw new java.lang.IllegalArgumentException();
        checkErrorAndCast(property);
    }
}
