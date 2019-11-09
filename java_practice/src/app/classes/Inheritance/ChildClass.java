
package app.classes.Inheritance;

public class ChildClass extends ParentClass {
    protected String name;

    public ChildClass(String name) {
        super(name);
        // This constructor has one parameter, name.
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Child " + this.name);
    }
}