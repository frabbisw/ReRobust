public java.util.List<com.astedt.robin.concurrentobjecthandler.ConcurrentObject> getObjects() {
    java.util.List<com.astedt.robin.concurrentobjecthandler.ConcurrentObject> objects = new java.util.ArrayList<>();
    try {
        for (com.astedt.robin.concurrentobjecthandler.ConcurrentObjectWorker worker : workers) {
            objects.addAll(worker.getObjects());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return objects;
}
