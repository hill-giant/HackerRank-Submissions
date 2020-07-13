//Write your code here
        HashSet hs = new HashSet<String>();
        t = 0; 
        for (int i = 0; i < pair_left.length; i++)
        {
            String cnct = pair_left[i] + " " + pair_right[i];
            if (!hs.contains(cnct))
            {
                System.out.println(++t);
                hs.add(cnct);
            }
            else
                System.out.println(t);
        }
