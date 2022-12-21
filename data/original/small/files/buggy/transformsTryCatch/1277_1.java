@javax.ws.rs.Path(value = "/start")
@javax.ws.rs.GET
@com.codahale.metrics.annotation.Timed
public com.intermancer.predictor.svc.dom.ExperimentStatus start() {
    com.intermancer.predictor.svc.dom.ExperimentStatus experimentStatus = getExperimentStatus();
    try {
        experimentStatus.setThreadAlreadyExecuting(startBackgroundThreadSafely());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return experimentStatus;
}
