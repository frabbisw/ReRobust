@org.junit.Test
public void testDeleteItemSuccessFail() {
    System.out.println("log");
    java.lang.System.out.println(server.logic.tables.ItemTable.getInstance().getItemTable());
    assertNotEquals("success", server.logic.tables.ItemTable.getInstance().delete("7894563214563", "0"));
}
