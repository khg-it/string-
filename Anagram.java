public class Anagram {
    public static void main(String []args)
    {
        String s1="abcd";
        String s2="dbca";
        int count=0;
        int len1=s1.length();
        int len2=s2.length();
        if(len1!=len2)
        {
            System.out.println("EXIT!!!!!");
        }
        else{
            char []chars1=s1.toCharArray();
            char []chars2=s2.toCharArray();
            for(int i=0;i<len1;i++)
            {
                for(int j=0;j<len2;j++)
                {
                    if(chars1[i]==chars2[j])
                    {
                        count++;
                    }
                }
            }
            if(count==len1)
            System.out.println("Strings are anagram");
            else
            System.out.println("Strings are not anagram");
        }
    }
}
