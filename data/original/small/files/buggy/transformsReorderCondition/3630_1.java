public static com.runningforlife.jason.SingletonExamples.LazySingletonSafe getInstance() {
    if (null == (com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance)) {
        synchronized (com.runningforlife.jason.SingletonExamples.LazySingletonSafe.class) {
            com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance = new com.runningforlife.jason.SingletonExamples.LazySingletonSafe();
        }
    }
    return com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance;
}
