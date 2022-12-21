public void setCode(java.lang.String code) {
    this.code = code;
    System.out.println("log");
    if ((this.errorCode) != null) {
        return;
    }
    this.errorCode = io.minio.ErrorCode.fromString(code);
}
