class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count=0;
        boolean leftEmpty=false;
        boolean rightEmpty=false;
        for(int i=0;i<flowerbed.length;i++){ //traversing through the array
            
            if(flowerbed[i]==0){            //to check if the place is empty or not
                 leftEmpty= (i==0) || (flowerbed[i-1]==0) ;
                 rightEmpty= (i==flowerbed.length-1) || (flowerbed[i+1]==0);
                }
                if(leftEmpty && rightEmpty)
                {
                    flowerbed[i]=1;
                    count++;


                }

        }
                if(n<=count){return true;}
                else return false;
        }
    }
