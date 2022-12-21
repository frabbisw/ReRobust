@java.lang.Override
public void onClick(android.view.View view) {
    dialogDrinkAccepted.dismiss();
    winnerDrink = 2;
    try {
        finishDialogChooseDrink(position2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
