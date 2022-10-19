import java.util.ArrayList;

public class ArrayListExample{
public static void main(String [] args){
System.out.println("main method is ok");

ArrayList name = new ArrayList();

System.out.println("Constractor is done");

name.add("Rupal");
System.out.println("Value is add");
name.add(24);
name.add(9.3);
name.add(true);
name.add('q');

System.out.println(name);
}
}