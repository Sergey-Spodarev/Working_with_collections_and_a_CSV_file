package model;

public class Department {
    private final int ID;
    private String name;
    private static int nextID = 1;

    public Department(String name) {
        this.name = name;
        this.ID = nextID;
        nextID++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
