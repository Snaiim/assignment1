import model.*;
import model.Point;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    static {
        try {
            sc = new Scanner(new File("C:\\Users\\PC\\IdeaProjects\\Assignment1\\src\\source"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            shape.addPoint(new Point(x, y));
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());
        System.out.println(shape.getAverageSide());
    }
}

