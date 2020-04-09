
/*You are given a string S (both uppercase and lowercase characters). 
 *You need to print the repeated character whose first appearance is leftmost.
**/

class Repeatation
{
    static int repeatedCharacter(String S)
    {
        // add your code here
        int[] index = new int[256];
        int ind = Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++)
        {
            if(index[S.charAt(i)]!=0 && index[S.charAt(i)]<ind)
            {
                ind=index[S.charAt(i)];
            }
            else
                index[S.charAt(i)]=i+1;
        }
        return ind!=Integer.MAX_VALUE?ind-1:-1;
    }
}
