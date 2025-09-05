package run.vail.Classes;

public abstract class Field {
    private final String name;

    public Field(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean validate(Object data);
}
