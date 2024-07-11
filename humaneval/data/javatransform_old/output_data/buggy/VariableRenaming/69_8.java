public static String decode_cyclic(String str) {
    class Cyclic {

        String encode_cyclic(String s) {
            ArrayList<String> groups = new ArrayList<String>();
            for (int i = 0; i < s.length(); i += 3) {
                groups.add(s.substring(i, Math.min(s.length(), i + 3)));
            }
            int remain = s.length() % 3;
            String result = "";
            for (String group : groups) {
                result += group.substring(1) + group.substring(0, 1);
            }
            if (remain > 0) {
                result += s.substring(s.length() - remain);
            }
            return result;
        }
    }
    final Cyclic var = new Cyclic();
    return var.encode_cyclic(var.encode_cyclic(str));
}
