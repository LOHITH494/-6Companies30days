class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x=0,y=0;
        if(x1<=xCenter && xCenter<=x2)
        {
            x=xCenter;
        }
        else if(xCenter<x1)
        {
            x=x1;
        }
        else
        {
            x=x2;
        }
        if(y1<=yCenter && yCenter<=y2)
        {
            y=yCenter;
        }
        else if(yCenter<y1)
        {
            y=y1;
        }
        else
        {
            y=y2;
        }
    x=x-xCenter;
    x*=x;
    y=y-yCenter;
    y*=y;
    return x+y<=(radius*radius);
    }
}