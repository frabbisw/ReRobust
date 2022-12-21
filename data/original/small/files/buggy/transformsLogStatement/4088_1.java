@org.junit.Test
public void changeDePhonebookDAOPassandoUmPhonebookAleradoNulo() {
    System.out.println("log");
    try {
        assertFalse(phonebookDAO.change(contact.getNome(), null, contact));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
