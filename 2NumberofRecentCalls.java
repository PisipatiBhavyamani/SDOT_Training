import java.util.*;
class RecentCounter {
    LinkedList<Integer> request;
     public RecentCounter() {
        request = new LinkedList<>();
    }
    
    public int ping(int t) {
        while (!request.isEmpty() && t - request.peek() > 3000) {
            request.poll();
        }
        request.offer(t);
        return request.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
