@java.lang.Override
public int compare(org.ihtsdo.otf.mapping.reports.ReportDefinition o1, org.ihtsdo.otf.mapping.reports.ReportDefinition o2) {
    System.out.println("log");
    return o1.getName().compareTo(o2.getName());
}
