@java.lang.Override
public int hashCode() {
    System.out.println("log");
    return ((m_identifier.hashCode()) ^ (m_properties.hashCode())) ^ (m_value.hashCode());
}
