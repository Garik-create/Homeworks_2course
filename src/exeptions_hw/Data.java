package exeptions_hw;

public class Data {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        try {
            checkPassword(password);
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (checkConfirmPassword(confirmPassword, password)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkLogin(String login) throws WrongLoginException {
        if (checking(login)) {
            return true;
        } else {
            throw new WrongLoginException("Login is not correct!");
        }
    }


    public static boolean checkPassword(String password) throws WrongPasswordException {
        if (checking(password)){
            return true;
        } else {
            throw new WrongPasswordException("Password is not correct!");
        }
    }

    public static boolean checking(String string) {
        if (string == null || string.isEmpty() || string.isBlank() || string.length() > 20) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) <= 57
                    || string.charAt(i) >= 65 && string.charAt(i) <= 90
                    || string.charAt(i) == 95
                    || string.charAt(i) >= 97 && string.charAt(i) <= 122) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkConfirmPassword(String confirmPassword, String password) {
        if (confirmPassword.equals(password)) {
            return true;
        } else {
            throw new RuntimeException("Пароли не совпадают!");
        }

    }


}


