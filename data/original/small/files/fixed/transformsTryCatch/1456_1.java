public void set(org.nutz.dao.entity.Entity<?> en) {
    try {
        synchronized (map) {
            this.map.put(en.getType(), en);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
