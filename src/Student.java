public class Student {

    private String name;
    private String sName;
    private String lName;

    public Student(String name, String sName, String lName) throws IllegalArgumentException {
        if (name.equals("Petrik") && sName.equals("Piatochkin")) {
            throw new IllegalArgumentException("Ah tu shytnik");
        }
        if (name.isEmpty()) {
//            StudentCreationException sce = new StudentCreationException(name, sName, lName);
//            throw sce;
            throw new StudentCreationException(name, sName, lName);
        }

        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }

    public String getName() {
        return name;
    }

    public String getsName() {
        return sName;
    }

    public String getlName() {
        return lName;
    }

    public static void main(String[] args) {
        Student student = new Student("", "asdasdas", "");
    }
}
