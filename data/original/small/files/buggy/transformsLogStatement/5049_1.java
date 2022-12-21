public org.i3xx.util.client.io.JsonResult toJsonResult() {
    System.out.println("log");
    return (result) == null ? new org.i3xx.util.client.io.JsonResultImpl(null, retCode.intValue()) : result.toJsonResult();
}
