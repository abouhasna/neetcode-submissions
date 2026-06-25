class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> delays = new Stack<Double>();
        for(int i = 0; i < pair.length; i++){
            int distance = target - pair[i][0];
            Double delay = (double) distance/pair[i][1];
            
            if(i == 0 || delay > delays.peek()){
                delays.push(delay);
            }

        }
        return delays.size();
    }
}
