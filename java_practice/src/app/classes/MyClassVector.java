package app.classes;

public class MyClassVector {
    protected float x, y;

    public MyClassVector(MyClassVector myClassVector) {
        this.x = myClassVector.x;
        this.y = myClassVector.y;
    }

    public MyClassVector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setVectors(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public MyClassVector copy() {
        return new MyClassVector(this);
    }

    public void printVectors() {
        System.out.println("{ x: " + x + " , y: " + y + " }");
        // return ("{ x: " + x + " , y: " + y + " }");
    }
}