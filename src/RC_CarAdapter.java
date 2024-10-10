

public class RC_CarAdapter implements RC_Drone{
    final private RC_Car AdapteeCar;

    public RC_CarAdapter(RC_Car adapteeCar){
        this.AdapteeCar = adapteeCar;
    }
    @Override
    public void throttleUP() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void throttleDown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void yawLeft() {
        AdapteeCar.turnLeft();
    }

    @Override
    public void yawRight() {
        AdapteeCar.turnRight();
    }

    @Override
    public void pitchForward() {
        AdapteeCar.goForward();
        AdapteeCar.speedUp();
    }

    @Override
    public void pitchBackward() {
        AdapteeCar.goBackward();
        AdapteeCar.speedUp();
    }

    @Override
    public void rollLeft() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rollRight() {
        throw new UnsupportedOperationException();
    }
}
