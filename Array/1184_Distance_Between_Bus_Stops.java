class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int bus1 = 0;
        int bus2 = 0;
        int k = destination;
        for(int i = 0; i < distance.length; i++){
            if(start <= i && i < destination || start > i && i >= destination){
                bus1 += distance[i];
            }else{
                bus2 += distance[i];
            }
        }
        if(bus1 > bus2) return bus2;
        return bus1;
    }
}