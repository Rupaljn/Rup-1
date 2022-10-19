public class ReverseValues{
public static void main(String [] args){

char a [] = {'r', 'u', 'p', 'a', 'l'};
ReverseValues.printRev();

}

public static void printRev(char a []){

for(int i = a.length-1; i>=0; i--){


System.out.println(a[i]);

}
}
}