package Week5.Session21;

import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nmap = new TreeMap<>();

        nmap.put(1,"Ashraf");
        nmap.put(2,"Eoin");
        nmap.put(3,"Sam");
        nmap.put(4,"Alex");
        nmap.put(5,"Tom");


        for(Map.Entry<Integer,String> m : nmap.entrySet()) {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        NavigableMap<Integer,String> nmap2 = nmap.descendingMap();

        System.out.println("Reverse order using Navigable map");
        for(Map.Entry<Integer,String> m : nmap2.entrySet()) {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        System.out.println("Keys in descending order :: ");
        Set<Integer> keySet = nmap.descendingKeySet();
        for(Integer i : keySet) {
            System.out.println(i);
        }

        System.out.println("Ceiling pair :: "+nmap.ceilingEntry(4));
        System.out.println("Ceiling Key :: "+nmap.ceilingKey(4));
        System.out.println("Floor Pair :: "+nmap.floorEntry(7));
        System.out.println("Floor Key :: "+nmap.floorKey(7));

        System.out.println("Higher pair than passed key :: "+nmap.higherEntry(4));
        System.out.println("Higher key than passed key :: "+nmap.higherKey(4));

        System.out.println("Lower pair than passed key :: "+nmap.lowerEntry(4));
        System.out.println("Lower key than passed key :: "+nmap.lowerKey(4));

        System.out.println("First key-value pair :: "+nmap.firstEntry());
        System.out.println("Last key-value pair :: "+nmap.lastEntry());

        NavigableMap<Integer,String> nmap3 =  nmap.headMap(3,true);
        System.out.println(nmap3);

        nmap3 = nmap.tailMap(3,true);
        System.out.println(nmap3);



    }
}

/*

1 : Ashraf
2 : Eoin
3 : Sam
4 : Alex
5 : Tom

Reverse order using Navigable map
5 : Tom
4 : Alex
3 : Sam
2 : Eoin
1 : Ashraf

Keys in descending order ::
5
4
3
2
1

Ceiling pair :: 4=Alex
Ceiling Key :: 4
Floor Pair :: 5=Tom
Floor Key :: 5
Higher pair than passed key :: 5=Tom
Higher key than passed key :: 5
Lower pair than passed key :: 3=Sam
Lower key than passed key :: 3
First key-value pair :: 1=Ashraf
Last key-value pair :: 5=Tom
{1=Ashraf, 2=Eoin, 3=Sam}
{3=Sam, 4=Alex, 5=Tom}


* */




