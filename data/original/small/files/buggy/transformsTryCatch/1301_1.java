public datamanagement.IUnit getUnit(java.lang.String unitCode) {
    datamanagement.IUnit unit = unitsByUnitCode_.get(unitCode);
    try {
        if (unit == null) {
            unit = createUnit(unitCode);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return unit;
}
