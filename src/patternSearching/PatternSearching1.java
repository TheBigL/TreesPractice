package patternSearching;

public class PatternSearching1
{
    public void patternSearch(String txt, String pat)
    {
        int L = txt.length();
        int M = pat.length();

        for(int i = 0; i <= L - M; i++)
        {
            int j;

            for(j = 0; j < M; j++)
            {
                if(txt.charAt(i + j) != pat.charAt(j))
                {
                    break;
                }

                if (j == M)
                {
                    System.out.println("Pattern found at index " + i);
                }
            }
        }

    }
}
