protected java.lang.String getFormattedDate(java.util.Date date) {
    System.out.println("log");
    return uk.chromis.pos.json.adapters.BaseAdapter.COMMON_DATE_FORMAT.format(date);
}
