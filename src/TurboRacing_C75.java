public class TurboRacing_C75 implements RC_Car{


    @Override
    public void turnLeft() {
        System.out.println("RC Car is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("RC Car is turning right");
    }

    @Override
    public void speedUp() {
        System.out.println("RC Car is speeding up");
    }

    @Override
    public void speedDown() {
        System.out.println("RC Car is speeding down");
    }

    @Override
    public void goForward() {
        System.out.println("RC Car is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("RC Car is going backward");
    }
}
