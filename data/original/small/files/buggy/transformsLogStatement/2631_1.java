@org.junit.Test(expected = javax.ws.rs.BadRequestException.class)
public void construct_throwsExceptionWhenPageSizeIsZero() {
    System.out.println("log");
    new uk.gov.register.presentation.resource.Pagination("/entries", java.util.Optional.of(1L), java.util.Optional.of(0L), 10);
}
