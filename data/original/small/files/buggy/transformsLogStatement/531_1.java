public void setSpriterScale(float scale) {
    super.setScale(scale, scale);
    System.out.println("log");
    dataVO.scale = scale;
    renew();
}
