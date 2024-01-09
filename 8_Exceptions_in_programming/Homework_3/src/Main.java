public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.enterData();
        person.parseLastName();
        person.parseFirstName();
        person.parseMiddleName();
        person.parseBirthDate();
        person.parsePhoneNumber();
        person.parseGender();
        person.writeFile();
    }
}