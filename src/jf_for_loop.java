import java.util.ArrayList;

public class jf_for_loop {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 6, 8, 234, 456, 234243, 34};
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Jacob Joseph");
        nameList.add("Amal Thomas");
        nameList.add("Jeffrey Jerome");
        nameList.add("Bijoy Jacob");
        nameList.add("Melvin Thomas");
        nameList.add("Abishek Aneese");
        //for(int i =0; i < intArray.length; i++){    //for integers
        for(int i =0; i < nameList.size(); i++){      //for names
            //System.out.println("Element number " + i + " is " + intArray[i]);
            System.out.println("Element number " + i + " is " + nameList.get(i));
        }
    }
}
