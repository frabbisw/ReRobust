public static String anti_shuffle(String s) {
    String result = "";
    for (String var : s.split(" ")) {
        char[] chars = var.toCharArray();
        Arrays.sort(chars);
        result += new String(chars) + " ";
    }
    return result.substring(0, result.length() - 1);
}
