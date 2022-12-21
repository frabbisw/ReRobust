public java.util.List<org.libreplan.business.resources.entities.Worker> getRealWorkers() {
    try {
        org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getRealWorkers" + (getWorker())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return workerModel.getRealWorkers();
}
