public static String decode_cyclic(String str) {
    class Cyclic {

        String encode_cyclic(String s) {
            ArrayList<String> groups = new ArrayList<String>();
            for (int i = 0; i < s.length(); i += 3) {
                groups.add(s.substring(i, Math.min(s.length(), i + 3)));
            }
            int remain = s.length() % 3;
            String var = "";
            for (String group : groups) {
                var += group.substring(1) + group.substring(0, 1);
            }
            if (remain > 0) {
                var += s.substring(s.length() - remain);
            }
            return var;
        }
    }
    final Cyclic cyclic = new Cyclic();
    return cyclic.encode_cyclic(cyclic.encode_cyclic(str));
}
