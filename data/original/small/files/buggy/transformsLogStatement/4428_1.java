@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    dialogDrinkAccepted.dismiss();
    winnerDrink = 2;
    finishDialogChooseDrink(position2);
}
