public void set(org.nutz.dao.entity.Entity<?> en) {
    try {
        this.map.put(en.getType(), en);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
