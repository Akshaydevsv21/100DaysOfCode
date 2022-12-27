class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue=new LinkedList<>();
        int maxlen=0;
        for(char c:s.toCharArray()){
            while(queue.contains(c)){
                queue.poll();
            }
            queue.offer(c);
            maxlen=Math.max(maxlen,queue.size());
        }
        return maxlen;
    }
}