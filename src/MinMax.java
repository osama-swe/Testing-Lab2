public class MinMax {
    private Double[] arr;
    public MinMax(Double[] arr){
        this.arr = arr;
    }
    public double getMax(){
        Double max = Double.MIN_VALUE;
        for (Double x: arr) {
            max = Math.max(x, max);
        }
        return max;
    }

    public double getMin(){
        Double min = Double.MAX_VALUE;
        for (Double x: arr){
            min = Math.min(x, min);
        }
        return min;
    }
}
