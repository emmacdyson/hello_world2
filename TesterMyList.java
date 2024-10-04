

public class TesterMyList{
    public static void main(String[] args) {
        MyList hi = new MyList();
        hi.add("hello");
        hi.add("hi");
        hi.add("by");
        hi.add("sigh");
        hi.add(2, "horse");
        hi.set(0, "oh");
        hi.remove(0);
        System.out.println(hi.indexOf("hi"));
        for (int i = 0; i < hi.size(); i++) {
            System.out.println(hi.get(i));
        }


    }
}
