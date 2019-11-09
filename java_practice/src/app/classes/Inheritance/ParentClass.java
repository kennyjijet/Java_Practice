
package app.classes.Inheritance;

public class ParentClass {
    protected String name;

    public ParentClass(String name) {
        // This constructor has one parameter, name.
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }
}