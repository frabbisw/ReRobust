public java.util.List<com.astedt.robin.concurrentobjecthandler.ConcurrentObject> getObjects() {
    java.util.List<com.astedt.robin.concurrentobjecthandler.ConcurrentObject> objects = new java.util.ArrayList<>();
    for (com.astedt.robin.concurrentobjecthandler.ConcurrentObjectWorker worker : workers) {
        objects.addAll(worker.getObjects());
    }
    System.out.println("log");
    return objects;
}
