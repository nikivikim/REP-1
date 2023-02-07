package Figure;

import com.example.task6.Shape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    public Rectangle() {type = "Прямоугольник";}

    Color colorShape, colorStroke;

    double x,y, strokeWidth;
    @Override
    public void setColor(Color color) {colorShape = color;}

    @Override
    public void setStroke(Color color) {colorStroke = color;}

    @Override
    public void setStrokeWidth(double value) {strokeWidth = value;}

    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(colorShape);
        gc.setStroke(colorStroke);
        gc.setLineWidth(strokeWidth);
        gc.fillRect(x, y, 50, 50);
    }
    @Override
    public String toString() {return type;}
}
