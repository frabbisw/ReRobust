public static boolean check_dict_case(HashMap<Object, Object> dict) {
    if (dict.size() == 0)
        return false;
    else {
        String state = "start";
        for (Object key : dict.keySet()) {
            if (!(key instanceof String)) {
                state = "mixed";
                break;
            }
            String var = (String) key;
            if (state.equals("start")) {
                if (var.toUpperCase().equals(var))
                    state = "upper";
                else if (var.toLowerCase().equals(var))
                    state = "lower";
                else {
                    state = "mixed";
                    break;
                }
            } else if ((state.equals("upper") && !var.toUpperCase().equals(var)) || (state.equals("lower") && !var.toLowerCase().equals(var))) {
                state = "mixed";
                break;
            }
        }
        return (state.equals("upper")) || (state.equals("lower"));
    }
}
