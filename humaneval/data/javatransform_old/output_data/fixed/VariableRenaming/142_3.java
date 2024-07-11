public static boolean valid_date(String date) {
    try {
        date = date.trim();
        String[] date_info = date.split("-");
        if (date_info.length > 3)
            return false;
        int var = Integer.parseInt(date_info[0]);
        int day = Integer.parseInt(date_info[1]);
        int year = Integer.parseInt(date_info[2]);
        if (var < 1 || var > 12)
            return false;
        int[] month_check1 = { 1, 3, 5, 7, 8, 10, 12 };
        for (int i = 0; i < month_check1.length; i++) {
            if (var == month_check1[i] && (day < 1 || day > 31))
                return false;
        }
        int[] month_check2 = { 4, 6, 9, 11 };
        for (int i = 0; i < month_check2.length; i++) {
            if (var == month_check2[i] && (day < 1 || day > 30))
                return false;
        }
        if (var == 2 && (day < 1 || day > 29))
            return false;
    } catch (Exception e) {
        return false;
    }
    return true;
}
