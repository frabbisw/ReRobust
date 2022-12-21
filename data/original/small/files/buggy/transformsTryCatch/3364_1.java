public void update(com.yourpc_shop.entity.Category category) {
    try {
        categoryDao.save(category);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
