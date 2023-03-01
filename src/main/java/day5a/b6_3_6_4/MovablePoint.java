package day5a.b6_3_6_4;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d) Speed=(%d, %d)",x, y, xSpeed, ySpeed );
    }

    @Override
    public void moveUp() {
        y = y - ySpeed;
    }

    @Override
    public void moveDown() {
        y = y + ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }
}
