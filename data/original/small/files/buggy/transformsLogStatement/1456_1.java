public void set(org.nutz.dao.entity.Entity<?> en) {
    System.out.println("log");
    this.map.put(en.getType(), en);
}
