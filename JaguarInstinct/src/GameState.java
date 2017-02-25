

public class GameState {
    int c0X = 0, c0y = 0, c1X, c1Y, c2X, c2Y, c3X, c3Y, middleX, middleY;
    int lm0X, lm0Y, lm1X, lm1Y, lm2X, lm2Y, lm3X, lm3Y;
    int bPX, bPY;
    int gkAX, gkAY;
    int nP, nE;
    int [][] players = new int[5][4];
    int [][] enemies = new int[5][4];

    void setField(int cx, int cy, int lm0X, int lm0Y, int lm3X, int lm3Y, int bx, int by, int gkAX, int gkAY){
        setField(cx, cy);
        this.lm0X = lm0X;
        this.lm0Y = lm0Y;
        this.lm3X = lm3X;
        this.lm3Y = lm3Y;
        this.lm1X = lm3X;
        this.lm1Y = lm0Y;
        this.lm2X = lm0X;
        this.lm2Y = lm3Y;
        bPX = bx;
        bPY = by;
        this.gkAX = gkAX;
        this.gkAY = gkAY;
    }

    void setField(int cx, int cy){
        c2X = cx;
        c2Y = cy;
        c1X = c0X;
        c1Y = cy;
        c3X = cx;
        c3Y = c0y;
        middleX = c2X/2;
        middleY = c1Y/2;
    }

    void setPlayers (int n, int [][] p){
        for(int i = 0; i < n; i++)
            System.arraycopy(p[i], 0, players[i],0, 4);
        nP = n;
    }

    void setEnemies(int n, int [][] p){
        for(int i = 0; i < n; i++)
            System.arraycopy(p[i], 0, enemies[i],0, 4);
        nE = n;
    }
}
