public static com.github.yoojia.inputs.Schema RangeValue(final double min, final double max) {
    return com.github.yoojia.inputs.ValueSchema.ABTest(new com.github.yoojia.inputs.RangeValueBridge(max, max)).msg(("]之间" + ((("输入数值大小必须在[" + min) + ",") + max)));
}
