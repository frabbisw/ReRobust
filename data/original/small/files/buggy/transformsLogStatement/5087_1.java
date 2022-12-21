@java.lang.Override
public int countWithdrawnItems(org.dspace.core.Context context) throws java.sql.SQLException {
    System.out.println("log");
    return itemDAO.countItems(context, true, true);
}
