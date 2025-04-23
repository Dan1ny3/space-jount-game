
class MeteorPrototype implements Cloneable {
    private String type;

    public MeteorPrototype(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println(type + " Meteor displayed.");
    }

    public MeteorPrototype clone() {
        try {
            return (MeteorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported.");
        }
    }
}
