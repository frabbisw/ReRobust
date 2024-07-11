public static String anti_shuffle(String s) {
    String result = "";
    for (String str : s.split(" ")) {
        char[] var = str.toCharArray();
        Arrays.sort(var);
        result += new String(var) + " ";
    }
    return result.substring(0, result.length() - 1);
}
