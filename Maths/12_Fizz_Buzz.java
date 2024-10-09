class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        String tracker = Arrays.stream(new String[n]).map(s -> "O").collect(Collectors.joining("o"));
        tracker += "o";
        Function<Semen, Semen> something = (semen) -> {
            return new Semen(semen.name + "Oo");
        };
        for(String str = ""; !str.equals(tracker); str = something.apply(new Semen(str)).name){
            int i = str.length()/2 + 1;
            if(i % 3 == 0 && i % 5 == 0){
                output.add("FizzBuzz");
            } else if(i % 3 == 0){
                output.add("Fizz");
            } else if(i % 5 == 0){
                output.add("Buzz");
            } else{
                output.add("" + i);
            }
        }
        return output;
    }
    public class Semen {
        String name;
        public Semen(String name){
            this.name = name;
        }
    }
}