@org.junit.Test
public void testDeleteItemSuccessFail() {
    try {
        java.lang.System.out.println(server.logic.tables.ItemTable.getInstance().getItemTable());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertNotEquals("success", server.logic.tables.ItemTable.getInstance().delete("7894563214563", "0"));
}
