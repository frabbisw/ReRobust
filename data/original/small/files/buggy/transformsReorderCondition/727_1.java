public boolean hasDomainFather() {
    return (m_sDomainFatherId.startsWith(SpaceInst.SPACE_KEY_PREFIX)) && (org.silverpeas.core.util.StringUtil.isDefined(m_sDomainFatherId));
}
