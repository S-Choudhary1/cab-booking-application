package cab.booking.Thinkify.util;

public class Place {
    public int sourceX;
    private int sourceY;
    private int destX;

    @Override
    public String toString() {
        return "Place{" +
                "sourceX=" + sourceX +
                ", sourceY=" + sourceY +
                ", destX=" + destX +
                ", destY=" + destY +
                '}';
    }

    public Place(int sourceX, int sourceY, int destX, int destY){
        this.sourceX = sourceX;
        this.sourceY = sourceY;
        this.destX = destX;
        this.destY = destY;
    }
    public Place(int sourceX,int sourceY){
        this.sourceX = sourceX;
        this.sourceY = sourceY;
    }

    public int getSourceX() {
        return sourceX;
    }

    public void setSourceX(int sourceX) {
        this.sourceX = sourceX;
    }

    public int getSourceY() {
        return sourceY;
    }

    public void setSourceY(int sourceY) {
        this.sourceY = sourceY;
    }

    public int getDestX() {
        return destX;
    }

    public void setDestX(int destX) {
        this.destX = destX;
    }

    public int getDestY() {
        return destY;
    }

    public void setDestY(int destY) {
        this.destY = destY;
    }

    private int destY;
}
