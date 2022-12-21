public void run() {
    instruments = new org.firstinspires.ftc.teamcode.organs.Instruments();
    try {
        instruments.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    bp = new org.firstinspires.ftc.teamcode.controllers.teleop.ButtonPusher(new org.firstinspires.ftc.teamcode.organs.Pusher());
    camera = new org.firstinspires.ftc.teamcode.tissues.TCamera();
    neuronTest = new org.firstinspires.ftc.teamcode.controllers.tests.NeuronTest(instruments, camera);
}
