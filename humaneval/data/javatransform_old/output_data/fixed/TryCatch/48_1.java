public static String anti_shuffle(String s) {
    String result = "";
    try {
        for (String str : s.split(" ")) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            result += new String(chars) + " ";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result.substring(0, result.length() - 1);
}
