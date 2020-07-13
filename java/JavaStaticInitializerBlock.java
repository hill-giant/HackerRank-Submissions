        static Scanner k = new Scanner(System.in);
        static int H = k.nextInt();
        static int B = k.nextInt();
        static boolean flag = true;
        static{
        try
        {
            if (H <= 0 || B <= 0) throw new Exception();
        }
        catch (Exception e)
        {
            flag = false;
            System.out.println(e + ": Breadth and height must be positive");
        }
        }   


