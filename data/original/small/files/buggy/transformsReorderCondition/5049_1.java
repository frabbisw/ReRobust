public org.i3xx.util.client.io.JsonResult toJsonResult() {
    return null == (result) ? new org.i3xx.util.client.io.JsonResultImpl(null, retCode.intValue()) : result.toJsonResult();
}
