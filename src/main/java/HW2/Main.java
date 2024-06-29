package HW2;

public class Main {
    public static void main(String[] args)  {
        System.out.println(validDate("timurLii@gmail.com", "123123", "123123"));

    }

    public static boolean validDate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Invalid login");
            }
            if (password.length() >= 20 || confirmPassword.length() >= 20) {
                throw new WrongPasswordException("Invalid password length");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Invalid password.Password mismatch.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
}
