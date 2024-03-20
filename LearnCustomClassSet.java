import java.util.Objects;

//public class LearnCustomClassSet {
public class LearnCustomClassSet implements Comparable<LearnCustomClassSet>{
    String name;
    int rollNo;

    public LearnCustomClassSet(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name ='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearnCustomClassSet that = (LearnCustomClassSet) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(LearnCustomClassSet that) { // compares the current student to the other student
        return this.rollNo - that.rollNo;
    }
}
