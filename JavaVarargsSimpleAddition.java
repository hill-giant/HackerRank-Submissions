class Add {
    public void add(int ...n)
    {
        int sum = 0;
        for (int i = 0; i < n.length; i++)
        {
            sum += n[i];
            System.out.print(n[i] + ((i < n.length - 1) ? "+" : "="));
        }
        System.out.println(sum);
    }
}
