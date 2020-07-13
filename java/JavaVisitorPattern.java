class SumInLeavesVisitor extends TreeVis {
    private int sum;
    public SumInLeavesVisitor() { sum = 0; }
    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
        return;
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long product;
    public ProductOfRedNodesVisitor() { product = -1; }
    public int getResult() {
        return (int)product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED)
        {
            if (product == -1)
                product = node.getValue();
            else
                product = (product*node.getValue())%(1000000007);
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED)
        {
            if (product == -1)
                product = leaf.getValue();
            else
                product = (product*leaf.getValue())%(1000000007);
        }
    }
}

class FancyVisitor extends TreeVis {
    private int nodeSum;
    private int greenLeafSum;
    public FancyVisitor() 
    {
        nodeSum = 0;
        greenLeafSum = 0;
    }
    public int getResult() {
        int difference = nodeSum - greenLeafSum;
        return (difference < 0) ? -1*difference : difference; 
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0)
            nodeSum += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN)
            greenLeafSum += leaf.getValue();
    }
}
    
public class VisitorPattern {
    static HashMap<Integer, HashSet<Integer>> nodes = new HashMap<>();
    static int[] values;
    static int[] colors;
    static boolean[] visited;

    public static Tree dfs(int vertex) {
        visited = new boolean[nodes.size()];
        if (nodes.get(vertex).isEmpty()) {
            return new TreeLeaf(values[vertex], 
                                Color.values()[colors[vertex]],
                                0);
        }
        else {
            visited[vertex] = true;
            return runDfs(vertex, 0);
        }
    }

    public static Tree runDfs(int vertex, int depth) {
        visited[vertex] = true;
        ArrayList<Tree> children = new ArrayList<>();
        for (Integer child : nodes.get(vertex))
            if (!visited[child])
                children.add(runDfs(child, depth + 1));
        if (children.isEmpty())
            return new TreeLeaf(values[vertex], 
                                Color.values()[colors[vertex]],
                                depth);
        else {
            TreeNode node = new TreeNode(values[vertex],
                                         Color.values()[colors[vertex]],
                                         depth);
            for (Tree child : children)
                node.addChild(child);
            return node;
        }
    }
    public static Tree solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        values = new int[n];
        colors = new int[n];
        for (int i = 0; i < n; i++)
        {
            nodes.put(i, new HashSet<Integer>());
            values[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            colors[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++)
        {
            int parent = in.nextInt() - 1;
            int child = in.nextInt() - 1;
            nodes.get(parent).add(child);
            nodes.get(child).add(parent);
        }
        return dfs(0); 
    }

