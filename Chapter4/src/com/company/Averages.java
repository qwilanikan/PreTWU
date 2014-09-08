package com.company;

/**
 * Created by sduvall10 on 8/29/14.
 */
public class Averages {
    Rectangle[] recs;

    public void initRecs(){
        recs = new Rectangle[5];

        recs[0] = new Rectangle(2,4);
        recs[1] = new Rectangle(5,8);
        recs[2] = new Rectangle(3,3);
        recs[3] = new Rectangle(8,2);
        recs[4] = new Rectangle(4,8);

    }

    public double findAreaAve(){
        int total = 0;
        int x = 0;
        while (x<recs.length) {
            total = total + recs[x].area();
            x++;
        }

        double ave = total/5;
        return ave;
    }

    public double findPerimeterAve() {
        int total = 0;
        int x = 0;
        while (x<recs.length) {
            total = total + recs[x].perimeter();
            x++;
        }
        double ave = total/5;
        return total;

    }
}

