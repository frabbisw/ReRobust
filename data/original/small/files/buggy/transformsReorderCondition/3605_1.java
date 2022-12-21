private boolean canJump() {
    if (((state) == (com.retroMachines.game.gameelements.RetroMan.State.JUMPINGE)) || ((state) == (com.retroMachines.game.gameelements.RetroMan.State.JUMPING))) {
        return false;
    }
    return true;
}
