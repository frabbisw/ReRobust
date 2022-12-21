@java.lang.Override
public com.pratilipi.data.type.Pratilipi createOrUpdatePratilipi(com.pratilipi.data.type.Pratilipi pratilipi, com.pratilipi.data.type.AuditLog auditLog) {
    try {
        com.pratilipi.data.mock.PratilipiMock.PRATILIPI_TABLE.add(pratilipi);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pratilipi;
}
