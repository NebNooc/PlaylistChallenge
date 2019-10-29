package io.zipcoder;

public class Music {

    private String[] playList;
    
    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counter1 = 0;
        int counter2 = 0;

        for(int i = 0; i <= startIndex; i++){
            counter1++;
        }
        for(int j = 0; j <= playList.length; j++){
            counter2++;
        }
        if(counter1 > counter2){
            return counter2;
        }
        else{
            return counter1;
        }


    }
}