package ConflictHomework.Group1;

public class PersonDetails {
    String name;
    String place;
    String group;

    public PersonDetails(String name, String place, String group) {
        this.name = name;
        this.place = place;
        this.group = group;
    }

    public void printDetails() {
        System.out.println(name + place + group);
    }

}
