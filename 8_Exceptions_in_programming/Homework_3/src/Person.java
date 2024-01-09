import MyExceptions.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Person {
    String personalData;
    String[] personalDataParts;
    String lastName;
    String firstName;
    String middleName;
    String birthDate;
    long phoneNumber;
    char gender;
    Scanner scanner = new Scanner(System.in);

    void enterData() throws Exception {

            System.out.println("Введите через пробел фамилию, имя, отчество, дату рождения в формате дд.мм.гггг," +
                    "номер телефона в формаите 123456789, пол латинскими буквами мужской - m, женский - .f");
            personalData = scanner.nextLine();
            personalDataParts = personalData.split(" ");
            if (personalDataParts.length < 6) {
                throw new LengthDataException("Введены не все данные");
            }
            if (personalDataParts.length > 6) {
                throw new LengthDataException("Введено больше данных");
            }
    }

    void parseLastName() throws Exception{
        lastName = personalDataParts[0];
        Pattern alphaBet = Pattern.compile("^[а-яА-Я]*$");
        boolean lastNameValidator = alphaBet.matcher(lastName).find();
        if (!lastNameValidator){
            throw new LastNameException("Фамимлия введена неверно");
        }
    }

    void parseFirstName() throws Exception{
        firstName = personalDataParts[1];
        Pattern alphaBet = Pattern.compile("^[а-яА-Я]*$");
        boolean firstNameValidator = alphaBet.matcher(firstName).find();
        if (!firstNameValidator){
            throw new FirstNameException("Имя введена неверно");
        }

    }
    void parseMiddleName() throws Exception{
        middleName = personalDataParts[2];
        Pattern alphaBet = Pattern.compile("^[а-яА-Я]*$");
        boolean middleNameValidator = alphaBet.matcher(middleName).find();
        if (!middleNameValidator){
            throw new FirstNameException("Имя введена неверно");
        }
    }

    void parseBirthDate() throws Exception{
        birthDate = personalDataParts[3];
        Pattern DATE_FORMAT_PATTERN = Pattern.compile("^\\d{2}.\\d{2}.\\d{4}$");
        boolean dateFormatValidator = DATE_FORMAT_PATTERN.matcher(birthDate).matches();

        if(!dateFormatValidator){
            throw new BirthDateException("Дата рождения введена в неверном формате");
        }
    }
    void parsePhoneNumber() throws Exception{
        try {
            phoneNumber = Long.parseLong(personalDataParts[4]);
        }
        catch (NumberFormatException e) {
            throw new PhoneNumberException("Номер телефона введен неверно");
        }
    }

    void parseGender() throws Exception{
        gender = personalDataParts[5].charAt(0);
        if (gender != 'm' & gender != 'f' ){
            throw new GenderException("Неверно введён пол");
        }
    }

    void writeFile() throws IOException {
        try(FileWriter writer = new FileWriter(lastName + ".txt", true)){
            writer.write("<" + lastName +">" + "<" + firstName + ">" + "<" + middleName + ">" +
                    "<" + birthDate +">" + "<" + phoneNumber + ">" + "<" + gender + ">");
            writer.write("\n");
            writer.flush();
        }
        catch (IOException e){
            System.out.println("Ошибка записи в файл" + e.getMessage());
            e.printStackTrace();
        }
    }
}
