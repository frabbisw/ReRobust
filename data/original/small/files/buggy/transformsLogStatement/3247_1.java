@java.lang.Override
public int getRowCount() {
    System.out.println("log");
    return (it.unisalento.BookLandia.dao.VenditaDAO.getInstance().getNumeroVendite()) - 1;
}
