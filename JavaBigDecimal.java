        s = Arrays.copyOfRange(s, 0, n);
        Arrays.sort(s, new Comparator<String>() {
           @Override
            public int compare(String a, String b) {
                BigDecimal one = new BigDecimal(a);
                BigDecimal two = new BigDecimal(b);
                return two.compareTo(one);
            }
        });
