public static void addData(java.lang.String result) {
    try {
        data.ResultData.stringBuilder.append(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
