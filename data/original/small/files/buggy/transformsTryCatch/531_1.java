public void setSpriterScale(float scale) {
    super.setScale(scale, scale);
    dataVO.scale = scale;
    try {
        renew();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
