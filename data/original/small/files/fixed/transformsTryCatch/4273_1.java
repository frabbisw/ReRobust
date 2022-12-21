@javax.inject.Inject
public void configureScheduler(@edu.dfci.cccb.mev.dataset.domain.r.annotation.Rserve int concurrency) {
    try {
        dispatcher = java.util.concurrent.Executors.newFixedThreadPool(concurrency);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
