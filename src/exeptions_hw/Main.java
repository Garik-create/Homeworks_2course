package exeptions_hw;

public class Main {
    public static void main(String[] args) {
        String login = "w";
        String password = "QWErty220";
        String confirmPassword = "QWErty22";

        if (Data.checkCredentials(login, password, confirmPassword)) {
            System.out.println("Ok!");
        } else {
            System.out.println("Not Ok!");
        }
    }
}


