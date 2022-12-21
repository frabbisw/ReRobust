public void setOrderDate(java.util.Date orderDate) {
    try {
        this.orderDate = com.vts.api.vtscore.service.util.VTSUtil.convertDateToString(orderDate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
