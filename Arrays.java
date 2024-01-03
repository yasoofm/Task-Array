public class Arrays{
    public static void main(String[] args){
        double[] weather = {30.2, 21, 25.3, 40, 29.9};
        weather[2] = 50;
        for(int i = 0; i < weather.length; i++){
        System.out.println(weather[i]);
        }
    }
}
