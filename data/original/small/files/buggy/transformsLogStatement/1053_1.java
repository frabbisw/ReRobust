@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    System.out.println("log");
    jetV.onNextStage(false, java.lang.Integer.parseInt(stages[which]));
}
