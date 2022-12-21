@java.lang.Override
public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(org.mybatis.generator.api.dom.xml.XmlElement element, org.mybatis.generator.api.IntrospectedTable introspectedTable) {
    try {
        resetUpdateXmlElementTableName(element);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.sqlMapUpdateByExampleWithBLOBsElementGenerated(element, introspectedTable);
}
