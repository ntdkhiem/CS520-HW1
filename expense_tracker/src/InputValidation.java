import javax.swing.*;

public class InputValidation {
    private static final double MIN_AMOUNT = 0.0;
    private static final double MAX_AMOUNT = 1000.0;
    private static final String[] VALID_CATEGORIES = {"food", "travel", "bills", "entertainment", "others"};

    public static boolean isValidAmount(double amount) {
        return amount > MIN_AMOUNT && amount < MAX_AMOUNT;
    }

    public static boolean isValidCategory(String category) {
        category = category.toLowerCase();
        for (String validCategory : VALID_CATEGORIES) {
            if (category.equals(validCategory)) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Category is invalid. Please only use the following categories: food, travel, bills, entertainment, others.");
        return false;
    }
};
