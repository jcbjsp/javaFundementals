public class jf_maps {
    public static void main(String[] args) {
        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "07912 123 123");
        myMap.put("Jam", "07912 234 123");
        myMap.put("Jack", "07912 567 123");
        myMap.put("Jake", "07912 891 123");
        myMap.put("Jacob", "07912 012 123");
        myMap.put("Jess", "07912 345 123");
        myMap.put("Jim", "Jim's new number");
        for(String element: myMap.values()) {   //prints out numbers (Values)
            //for(String element: myMap.keySet()) { //prints out names
            System.out.println(element);
        }
    }
}

