@org.junit.Test
public void findByIdTest() throws java.lang.Exception {
    System.out.println("log");
    java.util.Optional<io.gravitee.repository.management.model.Application> optional = applicationRepository.findById("application-sample");
    org.junit.Assert.assertTrue("Find application by name return no result ", optional.isPresent());
}
