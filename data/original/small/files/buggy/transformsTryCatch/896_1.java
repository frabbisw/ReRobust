@org.junit.Test(expected = javax.ws.rs.BadRequestException.class)
public void construct_throwsExceptionWhenPageSizeIsNegativeNumber() {
    try {
        new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of((-1L)), 10);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
