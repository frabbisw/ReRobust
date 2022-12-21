@java.lang.Override
protected void doInBack() throws java.lang.Exception {
    try {
        com.avoscloud.chat.service.CacheService.cacheUserIfNone(msg.getFrom());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
