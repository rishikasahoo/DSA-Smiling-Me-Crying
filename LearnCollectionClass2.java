import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass2 {

    public static void main(String args[]){

        List<LearnCustomClassSet> list = new ArrayList<>();

        list.add(new LearnCustomClassSet("Rishika", 20));
        list.add(new LearnCustomClassSet("Aayushi", 21));
        list.add(new LearnCustomClassSet("Mahek", 30));
        list.add(new LearnCustomClassSet("Dishank", 40));
        list.add(new LearnCustomClassSet("Abhishek", 45));
        list.add(new LearnCustomClassSet("Famul", 30));
        System.out.println(list);
        Collections.sort(list, new Comparator<LearnCustomClassSet>() { //making new comparator so that students can be compared and sorted on the basis of roll no, names, by our convenience, whereas last time we used 'comparable' -> can be sorted only by roll no, or name, or by any one means
            @Override
            public int compare(LearnCustomClassSet o1, LearnCustomClassSet o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        // cannot compare the CustomClassSet because comparable is not implemented in that class, so go and implement that first
        System.out.println(list);
        LearnCustomClassSet s1 = new LearnCustomClassSet("Mahek", 30);
        LearnCustomClassSet s2 = new LearnCustomClassSet("Famul", 50);

        System.out.println(s1.compareTo(s2));
    }
}
