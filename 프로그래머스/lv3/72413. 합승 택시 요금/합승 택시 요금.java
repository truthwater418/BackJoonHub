import java.util.*;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        Map<Integer, List<int[]>> root = new HashMap<>();
        // 가지정리
        for(int i = 0; i < fares.length; i++){
            int pointOne = fares[i][0];
            int pointTwo = fares[i][1];
            int value = fares[i][2];
            root.putIfAbsent(pointOne, new ArrayList<>());
            root.putIfAbsent(pointTwo, new ArrayList<>());
            root.get(pointOne).add(new int[]{pointTwo, value});
            root.get(pointTwo).add(new int[]{pointOne, value});
        }
        int[] minRoot = priorityDijkstra(n, root, s);
        int min = Integer.MAX_VALUE;
        for(int i  : root.keySet()){
            int[] values = priorityDijkstra(n, root, i);
            int sum = minRoot[i - 1] + values[a - 1] + values[b - 1];
            if(sum < min){
                min = sum;
            }
        }
        return min;
    }
    
    public static int[] priorityDijkstra(int n, Map<Integer, List<int[]>> root, int startPoint){
        int[] minRoot = new int[n];
        Arrays.fill(minRoot, Integer.MAX_VALUE);
        minRoot[startPoint - 1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{startPoint, 0});
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int currentPoint = node[0];
            int value = node[1];
            if(value > minRoot[currentPoint - 1]){
                continue;
            }
            for(int[] intArr : root.get(currentPoint)){
                int nextNode = intArr[0];
                int nextValue = intArr[1];
                if((long)minRoot[nextNode - 1] > (long)nextValue + value){
                    minRoot[nextNode - 1] = value + nextValue;
                    pq.add(new int[]{nextNode, value + nextValue});
                }
            }
        }
        return minRoot;
    }
}