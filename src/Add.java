public class Add {
        public Add() {
        }
        public int add(int[] num){
            int sum =0;
            for(int number:num){
                sum += number;
            }
            return sum;
        }
}
