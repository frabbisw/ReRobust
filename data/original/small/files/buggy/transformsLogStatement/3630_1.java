public static com.runningforlife.jason.SingletonExamples.LazySingletonSafe getInstance() {
    System.out.println("log");
    if ((com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance) == null) {
        synchronized (com.runningforlife.jason.SingletonExamples.LazySingletonSafe.class) {
            com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance = new com.runningforlife.jason.SingletonExamples.LazySingletonSafe();
        }
    }
    return com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance;
}
