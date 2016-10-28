package com.courses.spalah.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Татьяна on 09.10.2016.
 */
public class BallsPanel extends JPanel {
    public static final int MAX_COUNT_OF_BALLS = 10;
    List<Ball> balls = new ArrayList<>();

    BallsPanel() {
        this.setBackground(Color.BLACK);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Random random = new Random();
                int count = random.nextInt(MAX_COUNT_OF_BALLS) + 1;
                for (int i = 0; i < count; i++) {
                    Ball ball = new Ball(e.getPoint());
                    balls.add(ball);
                    Thread th = new Thread(new BallDirection(ball));
                    th.start();
                }
            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        for (Ball ball : balls) {
            gr.fillOval(ball.getCoordinates().x, ball.getCoordinates().y, ball.getRadius(), ball.getRadius());
            gr.setColor(ball.getColor());
        }
    }

    class BallDirection implements Runnable {
        Ball ball;

        BallDirection(Ball ball) {
            this.ball = ball;
        }

        @Override
        public void run() {
            while (true) {
                Point coordinates = ball.getCoordinates();
                coordinates.x += ball.getAx();
                coordinates.y += ball.getAy();
                Dimension windowSize = getSize();
                if (coordinates.x + ball.getRadius() >= windowSize.width) {
                    coordinates.x = windowSize.width - ball.getRadius();
                    ball.changeDirection(Direction.X);
                }
                if (coordinates.x < 0) {
                    coordinates.x = 0;
                    ball.changeDirection(Direction.X);
                }
                if (coordinates.y + ball.getRadius() >= windowSize.height) {
                    ball.changeDirection(Direction.Y);
                    coordinates.y = windowSize.height - ball.getRadius();
                }
                if (coordinates.y < 0) {
                    coordinates.y = 0;
                    ball.changeDirection(Direction.Y);
                }
                ball.setCoordinates(coordinates);
                try {
                   Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}