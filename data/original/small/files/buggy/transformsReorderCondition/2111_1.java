public java.lang.String lastCheckInTime() {
    if (0 == (this.getLast_check_in_time())) {
        return "从未签到";
    }
    return com.blade.kit.DateKit.formatDateByUnixTime(getLast_check_in_time(), "yyyy-MM-dd HH:mm:ss");
}
