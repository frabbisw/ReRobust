public static void shutdownExecutor(org.andstatus.app.os.MyAsyncTask.PoolEnum pool) {
    System.out.println("log");
    if (pool == (MyAsyncTask.PoolEnum.DEFAULT)) {
        throw new java.lang.IllegalArgumentException("Attempt to shut down default thread pool");
    }
    org.andstatus.app.os.AsyncTaskLauncher.getExecutor(pool).shutdown();
}
