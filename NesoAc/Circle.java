import javafx.geometry.Point2D;

public class Circle {
        Point2D center;
        double raduis;

        double getPerimeter() {
            return 2 * Math.PI * raduis;
        }

        double getArea() {
            return Math.PI * raduis * raduis;
        }

        void setRadius(double newRadius) {
            raduis = newRadius;
        }

        void setCenter(Point2D newcenter) {
            center = newcenter;
        }
    }