import java.util.* ;
 class Main{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(23);
        set.add(34);
        set.add(12);
        set.add(56);
        System.out.println("given set is: "+ set); //duplicate element is not printed
        System.out.println("size of givemn set is: "+ set.size());
        //delete the element from
        // setname.remove(data)

        set.remove(23);
        System.out.println(set);

    }
 }