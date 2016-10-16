package com.courses.spalah.Homework;

import java.awt.*;
import java.util.Random;

/**
 * Created by Татьяна on 05.10.2016.
 */
public class Ball {
    private static final int MAX_RADIUS = 80;
    private static final int MIN_RADIUS = 15;
    private static final int RGB_MAX = 255;
    private static final int MAX_SPEED = 20;
    private static final int MIN_SPEED = 5;

    private Point coordinates;
    private int radius;
    private Color color;
    private int Ax;
    private int Ay;

    Ball(Point point) {
        Random random = new Random();
        this.radius = random.nextInt(MAX_RADIUS) + MIN_RADIUS;
        this.coordinates = point;
        this.coordinates.x = point.x - radius/2;
        this.coordinates.y = point.y - radius/2;
        int red = random.nextInt(RGB_MAX);
        int green = random.nextInt(RGB_MAX);
        int blue = random.nextInt(RGB_MAX);
        this.color = new Color(red, green, blue);
        this.Ax = random.nextInt(MAX_SPEED) + MIN_SPEED;
        this.Ay = random.nextInt(MAX_SPEED) + MIN_SPEED;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public int getAx() {
        return Ax;
    }

    public int getAy() {
        return Ay;
    }

    public void changeDirection(Direction direction) {
        if (direction == Direction.X) {
            Ax = Ax * (-1);
        }
        if (direction == Direction.Y) {
            Ay = Ay * (-1);
        }
    }
}

enum Direction {
    X, Y;
}