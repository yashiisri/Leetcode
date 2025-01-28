class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create adjacency list
        Map<Integer, List<int[]>> adjacency = new HashMap<>();
        for (int[] time : times) {
            int src = time[0];
            int dst = time[1];
            int t = time[2];
            adjacency.computeIfAbsent(src, key -> new ArrayList<>()).add(new int[] { dst, t });
        }

        // Priority queue for Dijkstra's algorithm (min-heap based on time)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { k, 0 });
        Set<Integer> visited = new HashSet<>();
        int delays = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int time = current[1];
            int node = current[0];

            // Skip if the node has been visited
            if (!visited.add(node)) {
                continue;
            }

            delays = Math.max(delays, time);
            List<int[]> neighbors = adjacency.getOrDefault(node, new ArrayList<>());

            for (int[] neighbor : neighbors) {
                int neighborNode = neighbor[0];
                int neighborTime = neighbor[1];
                if (!visited.contains(neighborNode)) {
                    pq.add(new int[] { neighborNode, time + neighborTime });
                }
            }
        }

        // Check if all nodes have been visited
        return visited.size() == n ? delays : -1;
    }
}