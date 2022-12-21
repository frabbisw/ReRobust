@java.lang.Override
protected void doInBack() throws java.lang.Exception {
    try {
        com.avoscloud.chat.service.CacheService.cacheUserIfNone(message.getFrom());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
