public class S119Drone implements RC_Drone{

    @Override
    public void throttleUP() {
        System.out.println("Drone is ascending");
    }

    @Override
    public void throttleDown() {
        System.out.println("Drone is descending");
    }

    @Override
    public void yawLeft() {
        System.out.println("Drone is rotating left");
    }

    @Override
    public void yawRight() {
        System.out.println("Drone is rotating Right");
    }

    @Override
    public void pitchForward() {
        System.out.println("Drone is going forward");
    }

    @Override
    public void pitchBackward() {
        System.out.println("Drone is going backward");
    }

    @Override
    public void rollLeft() {
        System.out.println("Drone is rolling left");
    }

    @Override
    public void rollRight() {
        System.out.println("Drone is rolling right");
    }
}
