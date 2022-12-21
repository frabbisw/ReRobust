public static void reversedStringOrder(java.util.ArrayList<java.lang.String> stringArrayList) {
    try {
        for (int i = stringArrayList.size(); i > 0; i--) {
            java.lang.System.out.println(stringArrayList.get(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
