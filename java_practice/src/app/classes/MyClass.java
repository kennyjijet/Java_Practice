package app.classes;

public class MyClass {
    protected String name;

    public MyClass() {
        this.name = "";
    }

    public MyClass(String name) {
        // This constructor has one parameter, name.
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}