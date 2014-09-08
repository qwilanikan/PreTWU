package com.company;

/**
 * Created by sduvall10 on 8/29/14.
 */
public class AreaAverage {
    Rectangle[] recs;

    public void initRecs(){
        recs = new Rectangle[5];

        int x = 0;
        while (x < 5) {
            recs[x] = new Rectangle();
            x++;
        }
        recs[0].height = 2;
        recs[0].width = 4;

        recs[1].height = 5;
        recs[1].width = 8;

        recs[2].height = 3;
        recs[2].width = 3;

        recs[3].height = 8;
        recs[3].width = 2;

        recs[4].height = 4;
        recs[4].width = 8;

    }

    public double findAreaAve(){
        int total = 0;
        int x = 0;
        while (x<5) {
            total = total + recs[x].area();
            x++;
        }

        double ave = total/5;
        return ave;
    }
}
