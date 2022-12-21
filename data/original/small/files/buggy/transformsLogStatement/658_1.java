@java.lang.Override
public boolean placeOn(iitema.gypsypokemon.elements.Direction dir, iitema.gypsypokemon.elements.blocks.ItemInterface item) {
    if (super.placeOn(iitema.gypsypokemon.elements.Direction, iitema.gypsypokemon.elements.blocks.ItemInterface)) {
        this.door.open();
        return true;
    }
    System.out.println("log");
    return false;
}
