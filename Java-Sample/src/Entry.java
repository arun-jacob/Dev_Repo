import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;

class Entry{
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();

            List ar = new ArrayList<Integer>();
            for(int i=0;i<n;i++)
                ar.add(kb.nextInt());
            System.out.println(count(n,ar));

        }

        static int count(int n,List ar){
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

            Consumer<Integer> lam = (e) ->{
                if(!map.containsKey(e))
                    map.put(e,1);
                else
                    map.replace(e,map.get(e),map.get(e)+1);
            };
            ar.forEach(lam);
            final int[] count = {0};
            map.forEach((k,v)->{ int s=v.intValue()/2;
                count[0] = count[0] +s;
            });

//            map.forEach((integer, integer2) -> {
//                System.out.print("Key:" + integer + "  Value:" + integer2);
//            System.out.println();});
            return count[0];
        }
    }
