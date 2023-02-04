public class jf_boolean2 {
    public static void main(String[] args) {
        int timeOfDay = 23;
        // && means "logical and"
        // || means "logical or"
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good Morning!");
        } else if (timeOfDay >= 12 && (timeOfDay <= 18)) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }

    }
}

