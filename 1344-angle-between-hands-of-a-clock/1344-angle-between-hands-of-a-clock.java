class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = 30*hour+0.5*minutes;
        double min = 6*minutes;
        double angle = Math.abs(hr-min);
        return Math.min(angle,360-angle); 
    }
}