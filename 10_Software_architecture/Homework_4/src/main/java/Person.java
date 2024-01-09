public class Person implements Operation{
    private int id;
    private String FIO;
    private long cardNumber;
    private long hashPass;
    private String Login;

    public Person(int id, String FIO, long cardNumber, long hashPass, String login) {
        this.id = id;
        this.FIO = FIO;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        Login = login;
    }

    public int getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public Long getHashPass() {
        return hashPass;
    }

    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

    @Override
    public void BuyTicket(){

    }

}
