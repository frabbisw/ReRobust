public static String anti_shuffle(String s) {
    System.out.println("log");
    String result = "";
    for (String str : s.split(" ")) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        result += new String(chars) + " ";
    }
    return result.substring(0, result.length() - 1);
}
