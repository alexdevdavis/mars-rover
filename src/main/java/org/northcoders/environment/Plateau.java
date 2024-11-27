package org.northcoders.environment;

import org.northcoders.denizens.Occupyable;

import java.util.ArrayList;
import java.util.UUID;

public class Plateau {
    private final UUID id;
    private int xBoundary;
    private int yBoundary;
    private ArrayList<ArrayList<Occupyable>> matrix;

    public Plateau(int x, int y) throws IllegalArgumentException {
        this.id = UUID.randomUUID();
        setXBoundary(x);
        setYBoundary(y);
        generateMatrix();
    }

    private void generateMatrix() {
        if (this.matrix == null) {
            this.matrix = new ArrayList<>();

            for (int i = 0; i < yBoundary; i++) {
                ArrayList<Occupyable> row = new ArrayList<>();
                for (int j = 0; j < xBoundary; j++) {
                    row.add(null);
                }
                this.matrix.add(row);
            }
        }
    }

    public UUID getId() {
        return id;
    }

    public ArrayList<ArrayList<Occupyable>> getMatrix() {
        return matrix;
    }

    private void setXBoundary(int xBoundary) {
        if (xBoundary > 0) {
            this.xBoundary = xBoundary;
        } else {
            throw new IllegalArgumentException("Plateau x boundary must be greater than 0");
        }
    }

    private void setYBoundary(int yBoundary) {
        if (yBoundary > 0) {
            this.yBoundary = yBoundary;
        } else {
            throw new IllegalArgumentException("Plateau y boundary must be greater than 0");
        }
    }
}
