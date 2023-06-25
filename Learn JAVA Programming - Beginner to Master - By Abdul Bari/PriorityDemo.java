import java.util.*;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        return (i2-i1);
    }
}

class PriorityDemo
{
    public static void main(String ar[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek());

        pq.forEach((x)->System.out.println(x));

        pq.poll();

        System.out.println("After deletion");
        pq.forEach((x)->System.out.println(x));

    }
}