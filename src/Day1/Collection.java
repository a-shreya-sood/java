package Day1;
import java.util.*;
import java.util.Map.Entry;
public class Collection
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      ArrayList<Integer>a1=new ArrayList<>(10);
      ArrayList<Integer>a2=new ArrayList<>(List.of(67,3,99,23)); 
      
       a1.add(10);
       a1.add(0,2);
       a1.addAll(a2);
       System.out.println("Elements of list are:" + a1);
       for(int i=0;i<a1.size();i++)
       {
    	   System.out.println(a1.get(i));
       }
       
       
       //HASHSET
       HashSet<Integer>hs=new HashSet<Integer>();
       hs.add(10);
       hs.add(20);
       hs.add(30);
       hs.add(10);
       hs.add(23);
      //printing with LAMBDA function
      // hs.forEach((x)->System.out.println(x));
       System.out.println("elemnt of hashset are:"+hs);
       
       
       
       //HASHMAP
       Map<Integer,String>hm=new HashMap<Integer,String>();
       hm.put(0, "A");
       hm.put(1,"B");
       hm.put(2, "C");
       hm.put(3, "D");
       System.out.println(hm);
       
       for(Entry<Integer,String>e:hm.entrySet())
       {
    	   System.out.println("The key is:"+e.getKey());
       }
       //add element in the middle
       int position=1;
       int count=0;
       Map<Integer,String> newMap = new HashMap<>();
       for(Entry<Integer,String>entry:hm.entrySet())
       {
    	   if(count==position)
    	   {
    		   newMap.put(6,"X");
    	   }
     // System.out.println(t.getKey()+" "+t.getValue());
       newMap.put(entry.getKey(), entry.getValue());
       count++;
      
       }
       hm = newMap;
       System.out.println(hm);

	  
       //QUEUE Interface
       //Queue<Integer>qu=new PriorityQueue<Integer>(); 
       Queue<Integer>qu=new ArrayDeque<Integer>();
       qu.offer(22);
       qu.add(3);
       qu.add(99);
       System.out.println("The elements are:"+qu);
       
       
       
       //LIST INTERFACE
       List li=new ArrayList<>(List.of(66,2,12,90));
       li.add(28);
       li.add(10);
       li.add(88);
       System.out.println("Elements of list are:"+li);
//       li.forEach((x)->System.out.println("The elements of list:"+x));
//       for(Object e:li)
//       {
//    	   System.out.println("ooo:"+e);
//       }
       
       //linked list
       List<Integer>l2=new LinkedList<Integer>();
       l2.add(23);
       l2.add(33);
       l2.add(88);
       l2.add(12);
       System.out.println("Elements of linkedlist are:"+l2);
       
       
       
       System.out.println('c' + 'o' + 'd' + 'e');
       
       
       
       
       
	}

}
