import java.util.HashSet;
import java.util.Set;
public class LearnCustomClassSetRef {
    public static void main(String args[]){
        Set<LearnCustomClassSet> studentSet = new HashSet<>();

        studentSet.add(new LearnCustomClassSet("Rishika", 20));
        studentSet.add(new LearnCustomClassSet("Aayushi", 21));
        studentSet.add(new LearnCustomClassSet("Mahek", 30));
        studentSet.add(new LearnCustomClassSet("Dishank", 40));
        studentSet.add(new LearnCustomClassSet("Abhishek", 45));
        studentSet.add(new LearnCustomClassSet("Famul", 30));

        LearnCustomClassSet s1 = new LearnCustomClassSet("Mahek", 30);
        LearnCustomClassSet s2 = new LearnCustomClassSet("Famul", 30);
        System.out.println(s1.equals(s2));
        System.out.println(studentSet);
    }

}
