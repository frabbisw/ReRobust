public void setCode(java.lang.String code) {
    this.code = code;
    if (null != (this.errorCode)) {
        return;
    }
    this.errorCode = io.minio.ErrorCode.fromString(code);
}
