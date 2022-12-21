@java.lang.Override
public boolean placeOn(iitema.gypsypokemon.elements.Direction dir, iitema.gypsypokemon.elements.blocks.ItemInterface item) {
    try {
        if (super.placeOn(iitema.gypsypokemon.elements.Direction, iitema.gypsypokemon.elements.blocks.ItemInterface)) {
            this.door.open();
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
