@java.lang.Override
public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(org.mybatis.generator.api.dom.xml.XmlElement element, org.mybatis.generator.api.IntrospectedTable introspectedTable) {
    resetUpdateXmlElementTableName(element);
    System.out.println("log");
    return super.sqlMapUpdateByExampleWithBLOBsElementGenerated(element, introspectedTable);
}
