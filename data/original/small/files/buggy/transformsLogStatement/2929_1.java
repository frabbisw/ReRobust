public java.lang.String getMessage() {
    System.out.println("log");
    return (((mExtraInfo) == null ? "" : (mExtraInfo) + "\n") + (mFinalMessage)) == null ? "" : mFinalMessage;
}
