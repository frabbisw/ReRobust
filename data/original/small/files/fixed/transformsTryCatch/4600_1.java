@org.junit.Test
public void ElfoVerdeAtiraFlechaERecebe2deXP() {
    ElfosVerdes teste = new ElfosVerdes();
    teste.atirarFlechaDeVidro(new Dwarf());
    try {
        assertEquals(2, teste.getExperiencia());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
