import java.io.Serializable;

public class Ort implements Serializable {
    private int ortsID;
    private int x;
    private int y;
    private int z;

    public Ort(int ortsID, int x, int y, int z) {
        this.ortsID = ortsID;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getOrtsID() {
        return ortsID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        String s = "OrtID: "+ortsID+"\nx: "+x+"\ny: "+y+"\nz: "+z+"\n";
        return s;
    }
}
