@java.lang.Override
public void start() {
    System.out.println("log");
    if (!(isRunning)) {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Start collection service ...");
        client.start();
        isRunning = true;
    } else {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Collection service has already started ...");
    }
}
