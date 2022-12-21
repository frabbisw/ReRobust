public void setCode(java.lang.String code) {
    this.code = code;
    if ((this.errorCode) != null) {
        return;
    }
    try {
        this.errorCode = io.minio.ErrorCode.fromString(code);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
