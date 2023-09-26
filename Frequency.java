    public class Frequency {
        
        public static void main(String[] args) {
            String  s = "MoHMit";
            s = s.toLowerCase();
            int[] b=new int[26];
            for(int i=0;i<s.length();i++)
            b[s.charAt(i)-'a']++;

            int max=b[0],index=-1,i;
            for(i=1;i<b.length;i++)
            {
                if(b[i]>max)
                {
                    max=b[i];
                    index=i;
                }
            }
            System.out.println((char)(index+97));

        }
    }
