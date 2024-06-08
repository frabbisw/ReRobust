public static String anti_shuffle(String s) {
    String var = "";
    for (String str : s.split(" ")) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        var += new String(chars) + " ";
    }
    return var.substring(0, var.length() - 1);
}
