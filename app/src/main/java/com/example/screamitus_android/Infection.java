package com.example.screamitus_android;

public class Infection {




    public int calculateTotalInfected(int day){

        // TC1 if number of days less than 0
        if(day <=  0){
            return -1;
        }

        // TC2 If instructor rate is 5 per day
        else if(day >0 && day < 8){
            return  day*5;
        }

        //TC3 infection change if day >7

        else{
            int infected = (7*5) + (day-7)*8 ;
            return  infected;

        }




    }
}
