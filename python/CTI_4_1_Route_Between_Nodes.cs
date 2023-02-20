bool ValidPath(int n, int[][] edges, int source, int destination)
{
    Dictionary<int, List<int>> map = new();
    HashSet<int> visited = new();
    Queue<int> q = new();

    for (int i = 0; i < edges.Length; i++)
    {
        int first = edges[i][0];
        int second = edges[i][1];

        if (map.ContainsKey(first))
        {
            map[first].Add(second);
        }
        else
        {
            map.Add(first, new List<int> { second });
        }

        if (map.ContainsKey(second))
        {
            map[second].Add(first);
        }
        else
        {
            map.Add(second, new List<int> { first });
        }
    }

    q.Enqueue(source);

    while (q.Count != 0)
    {
        int node = q.Dequeue();
        if (!visited.Contains(node))
        {
            visited.Add(node);
            if (node == destination)
            {
                return true;
            }
            else
            {
                List<int> neigh = map[node];
                foreach (int x in neigh)
                {
                    q.Enqueue(x);
                }
            }
        }
    }
    return false;

}