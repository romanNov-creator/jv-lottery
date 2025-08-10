package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(new Random().nextInt(101));
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;
    }
}
