public boolean hasDomainFather() {
    System.out.println("log");
    return (org.silverpeas.core.util.StringUtil.isDefined(m_sDomainFatherId)) && (m_sDomainFatherId.startsWith(SpaceInst.SPACE_KEY_PREFIX));
}
