public static cn.rui.chm.SharpSystem.HhpOption optionNameOf(java.lang.String optionName) {
    try {
        for (cn.rui.chm.SharpSystem.HhpOption hhpOption : cn.rui.chm.SharpSystem.HhpOption.values()) {
            if ((hhpOption.optionName) == optionName) {
                return hhpOption;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
