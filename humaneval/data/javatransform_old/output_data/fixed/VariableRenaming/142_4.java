public static boolean valid_date(String date) {
    try {
        date = date.trim();
        String[] date_info = date.split("-");
        if (date_info.length > 3)
            return false;
        int month = Integer.parseInt(date_info[0]);
        int var = Integer.parseInt(date_info[1]);
        int year = Integer.parseInt(date_info[2]);
        if (month < 1 || month > 12)
            return false;
        int[] month_check1 = { 1, 3, 5, 7, 8, 10, 12 };
        for (int i = 0; i < month_check1.length; i++) {
            if (month == month_check1[i] && (var < 1 || var > 31))
                return false;
        }
        int[] month_check2 = { 4, 6, 9, 11 };
        for (int i = 0; i < month_check2.length; i++) {
            if (month == month_check2[i] && (var < 1 || var > 30))
                return false;
        }
        if (month == 2 && (var < 1 || var > 29))
            return false;
    } catch (Exception e) {
        return false;
    }
    return true;
}
