public class jf_array {
    public static void main(String[] args) {
        Integer[] myIntArray = {23, 34, 45, 56, 67};
        java.util.List<Integer>myList = java.util.Arrays.asList(myIntArray);
        java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>(myList);
        myArrayList.set(2, 89);
        myArrayList.add(1234);
        for (int element: myArrayList) {
            System.out.println(element);
        }

    }
}

