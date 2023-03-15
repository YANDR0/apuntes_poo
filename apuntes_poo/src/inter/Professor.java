package inter;

public class Professor extends Employee implements CanvasUser, CubiculeUser{

    @Override
    public void openDoor() {

    }

    @Override
    public boolean login() {
        return true;
    }

    @Override
    public void fly() {
    }
}
