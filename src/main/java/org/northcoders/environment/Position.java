package org.northcoders.environment;

public class Position {
    enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    int X;
    int Y;
    Direction directionFacing;
}
