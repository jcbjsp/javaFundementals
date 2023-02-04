public class jf_boolean {
    public static void main(String[] args) {
        int ageOfViewer = 18;
        if (ageOfViewer < 15) {
            System.out.println("U, PG and 12 films are available");
        } else if (ageOfViewer < 18) {
            System.out.println("U, PG, 12 and 15 films are available");
        } else {
            System.out.println("All films are available");
        }
    }
}
