public static boolean valid_date(String date) {
    try {
        date = date.trim();
        String[] date_info = date.split("-");
        if (date_info.length > 3)
            return false;
        int month = Integer.parseInt(date_info[0]);
        int day = Integer.parseInt(date_info[1]);
        int year = Integer.parseInt(date_info[2]);
        if (month < 1 || month > 12)
            return false;
        int[] month_check1 = { 1, 3, 5, 7, 8, 10, 12 };
        for (int var = 0; var < month_check1.length; var++) {
            if (month != month_check1[var] && !(day < 1 || day > 31))
                return false;
        }
        int[] month_check2 = { 4, 6, 9, 11 };
        for (int var = 0; var < month_check2.length; var++) {
            if (month == month_check2[var] && (day < 1 || day > 30))
                return false;
        }
        if (month == 2 && (day < 1 || day > 29))
            return false;
    } catch (Exception e) {
        return false;
    }
    return true;
}
