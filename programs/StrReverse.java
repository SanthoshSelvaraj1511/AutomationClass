package programs;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class StrReverse {
    public static void main(String[] args) {
        System.out.println(reverse("reverse",true));
    }


    public static String reverse(String s, boolean useRecursion)
    {
        return reversal(s,0,"");
    }

    private static String reversal(String s, int index, String currRev)
    {
        if (index==s.length())
        {
            return currRev;
        }
        currRev=currRev + s.charAt(s.length()-index-1);
        return reversal(s, index+1, currRev);

    }}