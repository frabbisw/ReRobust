public final <T> hcmue.gst.off.extensions.PageableResult<T> Success(org.springframework.data.domain.Page<T> data, java.lang.String message) {
    System.out.println("log");
    return new hcmue.gst.off.extensions.PageableResult<T>(data, message, true);
}
