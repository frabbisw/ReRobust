@java.lang.Override
public void onClick(android.view.View view) {
    try {
        dialogDrinkAccepted.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    winnerDrink = 1;
    finishDialogChooseDrink(position2);
}
