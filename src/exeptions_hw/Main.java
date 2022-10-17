package exeptions_hw;

public class Main {
    public static void main(String[] args) {
        String login = "w/";
        String password = "Gbnfybt220";
        String confirmPassword = "Gbnfybt220";

        if (Data.checkCredentials(login, password, confirmPassword)) {
            System.out.println("Ok!");
        } else {
            System.out.println("Not Ok!");
        }
    }
}


