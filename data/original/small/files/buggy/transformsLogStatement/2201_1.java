public void setOrderDate(java.util.Date orderDate) {
    System.out.println("log");
    this.orderDate = com.vts.api.vtscore.service.util.VTSUtil.convertDateToString(orderDate);
}
