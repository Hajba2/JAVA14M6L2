public class StudentCreationException extends RuntimeException {

    private String name;
    private String sName;
    private String lName;

    public StudentCreationException(String name, String sName, String lName) {
        super(String.format("Incorrect user initialization. " +
                "You can`t create user with \"%s\" name, \"%s\" second name, \"%s\" last name.", name, sName, lName));
        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }
}
