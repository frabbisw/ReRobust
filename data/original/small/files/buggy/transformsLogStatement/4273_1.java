@javax.inject.Inject
public void configureScheduler(@edu.dfci.cccb.mev.dataset.domain.r.annotation.Rserve int concurrency) {
    System.out.println("log");
    dispatcher = java.util.concurrent.Executors.newFixedThreadPool(2);
}
