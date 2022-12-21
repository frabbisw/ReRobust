public void setCode(java.lang.String code) {
    this.code = code;
    try {
        this.errorCode = io.minio.ErrorCode.fromString(this.code);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
