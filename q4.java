public class q4 {
        public static void main(String []args){
            int flag=0;
            String s=new String("Eye");
            s=s.toLowerCase(); 
            int n=s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)==s.charAt(n-1-i))continue;
                else flag=1;
            }
            if(flag==0){
                System.out.println("String is palindrome!");
            }
            else{
                System.out.println("String is not a palindrome!");
            }
        }
    }

