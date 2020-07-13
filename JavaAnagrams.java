    public static boolean isAnagram(String a, String b)
    {
        Scanner kb = new Scanner(System.in);
        boolean anagram = a.length() == b.length();
        a = a.toLowerCase();
        b = b.toLowerCase();
        TreeMap<Character, Integer> ma = new TreeMap<Character, Integer>();
        TreeMap<Character, Integer> mb = new TreeMap<Character, Integer>();
        int min = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < min; i++)
        {
            char ca = a.charAt(i);
            char cb = b.charAt(i);
            int count = ma.containsKey(ca) ? ma.get(ca) : 0;
            ma.put(ca, count + 1);
            count = mb.containsKey(cb) ? mb.get(cb) : 0;
            mb.put(cb, count + 1);
        }
        for (int i = 0; i < min && anagram; i++)
        {
            anagram = ma.get(a.charAt(i)) == mb.get(a.charAt(i));
        }
        return anagram;
    }

