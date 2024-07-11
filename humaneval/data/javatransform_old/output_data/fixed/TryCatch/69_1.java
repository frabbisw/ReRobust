public static String decode_cyclic(String str) {
    try {
        class Cyclic {

            String encode_cyclic(String s) {
                ArrayList<String> groups = new ArrayList<String>();
                for (int i = 0; i < s.length() - s.length() % 3; i += 3) {
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
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    final Cyclic cyclic = new Cyclic();
    return cyclic.encode_cyclic(cyclic.encode_cyclic(str));
}
