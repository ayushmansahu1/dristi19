public class q2 {

public static void main(String[] args) {
   String s1="HEllo";
   String s2="Hello";
   if (s1 == null || s2 == null){
       System.out.println("One of the strings is Null");
}else{
   int n = s1.length();
   if (n != s2.length()){
       System.out.println("Strings are not equal in length");
       } else {
   for (int i=0;i<n;i++){
       char c1 = s1.charAt(i);
       char c2 = s2.charAt(i);
       if (c1 != c2){
           System.out.println("The Strings are Not Equal");
           return;
           // break;
           }
           }
           System.out.println("The Strings Are Equal");
           }
       }
}
}