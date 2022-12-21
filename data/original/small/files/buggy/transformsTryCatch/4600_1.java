@org.junit.Test
public void ElfoVerdeAtiraFlechaERecebe2deXP() {
    ElfosVerdes teste = new ElfosVerdes("Arthur");
    try {
        teste.atirarFlechaDeVidro(new Dwarf());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(2, teste.getExperiencia());
}
