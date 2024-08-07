class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if((str1+str2).equals(str2+str1)== true){ //if the combined string is equal then only it can have common factor a+b==b+a

            int len1=str1.length();
            int len2=str2.length();
            int gcdno= gcd(len1,len2);
            return str1.substring(0, gcdno);

        }
        else{
            return "";
        }
        
    }


      private  int gcd(int a,int b) //using Euclidean algorithms
        {

            while(b!=0){
                int temp= b;
                b= a%b;
                a=temp;

            }

            return a;

        }
}