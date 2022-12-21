public java.util.List<org.libreplan.business.resources.entities.Worker> getRealWorkers() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(((getWorker()) + "WorkerCRUDController.getRealWorkers"));
    return workerModel.getRealWorkers();
}
