class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max=0; List<Boolean> resultList= new ArrayList<>();
        
for(int i =0;i< candies.length;i++){
    if(candies[i]>max){
        max=candies[i];
    }
    
}//end of the for loop for finding max value of the candies by a child


for(int i=0;i<candies.length;i++){
if((candies[i]+extraCandies)>=max){
    resultList.add(true);
}
else{
    resultList.add(false);
}

}
return resultList;


    }
}