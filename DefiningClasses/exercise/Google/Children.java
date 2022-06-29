package DefiningClasses.exercise.Google;

public class Children {

    private String childName;
    private String childBirth;

    public Children(String childName, String childBirth) {
        this.childName = childName;
        this.childBirth = childBirth;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirth() {
        return childBirth;
    }

    public void setChildBirth(String childBirth) {
        this.childBirth = childBirth;
    }
}
