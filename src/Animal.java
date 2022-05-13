public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String aName, boolean doggo) {
        this.name = aName;
        this.isDog = doggo;
    }

    public String getName() {
        return name;
    }

    public boolean getDoggo() {
        return isDog;
    }

}