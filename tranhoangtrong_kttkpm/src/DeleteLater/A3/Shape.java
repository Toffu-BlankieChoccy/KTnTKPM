package DeleteLater.A3;

public abstract class Shape {
    protected String brush, paper, frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public abstract String draw();
}

