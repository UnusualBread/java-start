package C01_java.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L02_fields_and_methods_in_enum;

/*
There is a robot in the game field. The position of the robot in this field is
described by two integer coordinates: X and Y. The X axis is oriented from left
to right, the Y axis — from bottom to top.

At the initial moment, the robot is located at some coordinate on the field.
It's also known where the robot looks: up, down, to the right or to the left.
The initial position of the robot and its direction can have any values. You
need to bring the robot to the destination point of the game field.
*/

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    switch (robot.getDirection()) {
                        case UP -> robot.turnLeft();
                        case RIGHT -> {
                            robot.turnLeft();
                            robot.turnLeft();
                        }
                        case DOWN -> robot.turnRight();
                    }
                }
                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.RIGHT) {
                    switch (robot.getDirection()) {
                        case UP -> robot.turnRight();
                        case RIGHT -> {
                            robot.turnRight();
                            robot.turnRight();
                        }
                        case DOWN -> robot.turnLeft();
                    }
                }
                robot.stepForward();
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    switch (robot.getDirection()) {
                        case UP -> {
                            robot.turnLeft();
                            robot.turnLeft();
                        }
                        case RIGHT -> robot.turnRight();
                        case LEFT -> robot.turnLeft();
                    }
                }
                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.UP) {
                    switch (robot.getDirection()) {
                        case DOWN -> {
                            robot.turnLeft();
                            robot.turnLeft();
                        }
                        case RIGHT -> robot.turnLeft();
                        case LEFT -> robot.turnRight();
                    }
                }
                robot.stepForward();
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
