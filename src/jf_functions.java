public class jf_functions {
    public static void printName(String fullName){
        System.out.println("The full name is " + fullName);
    }
    public static String makeFullName(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public static void main(String[] args) {
        printName(makeFullName("Jacob", "Joseph"));
    }
}
