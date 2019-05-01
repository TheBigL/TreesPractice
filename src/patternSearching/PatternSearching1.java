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


            }

            if (j == M)
            {
                System.out.println("Pattern found at index " + i);
            }
        }

    }

    public void KPMPatternSearch(String txt, String pat)
    {
        int L = txt.length();
        int M = pat.length();

        int[] lps = new int[M];

        computeKPMArray(pat, M, lps);




    }

    public void computeKPMArray(String pat, int M, int[] lps)
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M)
        {
            if (pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }

            else
            {
                if (len != 0)
                {
                    len = lps[len - 1];

                }

                else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }


    }
}
