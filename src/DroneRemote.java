public class DroneRemote {
    private final RC_Drone droneToBeControlld;
    public DroneRemote(RC_Drone drone){
        this.droneToBeControlld = drone;
    }
    public void leftJoystickUp(){
        droneToBeControlld.throttleUP();
    }

    public void leftJoystickDown(){
        droneToBeControlld.throttleDown();
    }
    public void leftJoystickLeft(){
        droneToBeControlld.yawLeft();
    }
    public void leftJoystickRight(){
        droneToBeControlld.yawRight();
    }
    public void leftJoystickUpLeft(){
        droneToBeControlld.throttleUP();
        droneToBeControlld.yawLeft();
    }
    public void leftJoystickUpRight(){
        droneToBeControlld.throttleUP();
        droneToBeControlld.yawRight();
    }

    public void leftJoystickDownLeft(){
        droneToBeControlld.throttleDown();
        droneToBeControlld.yawLeft();
    }
    public void leftJoystickDownRight(){
        droneToBeControlld.throttleDown();
        droneToBeControlld.yawRight();
    }
    public void rightJoystickUp(){
        droneToBeControlld.pitchForward();
    }

    public void rightJoystickDown(){
        droneToBeControlld.pitchBackward();
    }
    public void rightJoystickLeft(){
        droneToBeControlld.rollLeft();
    }
    public void rightJoystickRight(){
        droneToBeControlld.rollRight();
    }
    public void rightJoystickUpLeft(){
        droneToBeControlld.pitchForward();
        droneToBeControlld.rollLeft();
    }
    public void rightJoystickUpRight(){
        droneToBeControlld.pitchForward();
        droneToBeControlld.rollRight();
    }

    public void rightJoystickDownLeft(){
        droneToBeControlld.pitchBackward();
        droneToBeControlld.rollLeft();
    }
    public void rightJoystickDownRight(){
        droneToBeControlld.pitchBackward();
        droneToBeControlld.rollRight();
    }
}
