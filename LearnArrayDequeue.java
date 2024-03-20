import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(26);
        adq.offerFirst(12);
        adq.offerLast(45);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());


    }

}
