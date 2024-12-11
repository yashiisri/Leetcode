class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr=new ArrayList<>();
        int ans=0;
        for (int i=0;i<operations.length;i++){
            if (operations[i].equals("+") && arr.size()<2){
                continue;
            }
            if (arr.size()==0){
                if (operations[i].equals("C") || operations[i].equals("D")){
                    continue;
                    }
            }
            if (operations[i].equals("+")){
                if (arr.size()>=2){
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
                }
                continue;
            }
            if (operations[i].equals("C")){
                if (arr.size()>0){
                arr.remove(arr.size()-1);
                }
                continue;
            }
            if (operations[i].equals("D")){
                if (arr.size()>0){
                int m=(arr.get(arr.size()-1))*2;
                arr.add(m);
                }
                continue;
            }
            int i5=Integer.parseInt(operations[i]);
            arr.add(i5);

        }
        for (int i1:arr){
            ans+=i1;
        }
        return ans;
        
    }
}