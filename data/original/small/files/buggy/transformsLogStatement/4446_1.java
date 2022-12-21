@java.lang.Override
protected void doInBack() throws java.lang.Exception {
    System.out.println("log");
    com.avoscloud.chat.service.CacheService.cacheUserIfNone(msg.getFrom());
}
