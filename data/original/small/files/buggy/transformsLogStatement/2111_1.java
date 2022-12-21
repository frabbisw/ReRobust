public java.lang.String lastCheckInTime() {
    System.out.println("log");
    if ((this.getLast_check_in_time()) == 0) {
        return "从未签到";
    }
    return com.blade.kit.DateKit.formatDateByUnixTime(getLast_check_in_time(), "yyyy-MM-dd HH:mm:ss");
}
