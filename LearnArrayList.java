import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList {
    public static void main(String args[]){

        // CREATING SIMPLE ARRAY WITHOUT USING ARRAYLIST
        //String [] studentsName = new String[30];
        //studentsName[1] = "Rakesh";
        //System.out.print(studentsName[1]);

        // USING ArrayList
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Aayushi");
        studentsName.add("Mahek");
        studentsName.add("Dishank");
        studentsName.add("Famul");
        studentsName.add("Abhishek");
        //System.out.print(studentsName);

        // Creating list and adding
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list);
        list.add(4);
        //System.out.println(list);
        list.add(1,50); // add element in a particular position-> METHOD OVERLOADING
        //System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);

        System.out.println(list);
        //LOOPS IN LISTS:
        for(int i = 0; i< list.size(); i++){
            System.out.println("The element is:" + list.get(i));  // to iteratively get the elements of the list
        }

        //USING FOR IS LOOP:
        for(Integer element: list){
            System.out.println("The element is:" + element); // another way to iterate
        }

        //USING ITERATOR:
        Iterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            System.out.println("Iterator :" + it.next());
        }

        //LIST ALTERATIONS:
        System.out.println(list.get(1)); // to get any element
        list.remove(1);  // to remove any element-> giving the index no of the element
        list.remove(3);
        list.remove(Integer.valueOf(150)); //removing a particular element by naming that element -> Method Overloading
        System.out.println(list);
        list.set(0,1000); // replaces the element
        System.out.println(list);
        System.out.println(list.contains(1000)); // checks whether a element is contained in the list or not
        list.clear(); // clears the whole list
        System.out.println(list);
    }
}
