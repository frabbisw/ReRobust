@java.lang.Override
public boolean canParse(java.lang.String type) {
    boolean exists = false;
    try {
        com.epam.page.object.generator.parser.CommonElementsRuleParser.CommonElementType.valueOf(type);
    } catch (java.lang.IllegalArgumentException e) {
        exists = true;
    }
    return !(exists);
}
