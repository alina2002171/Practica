public class Class {
  private   int number;
  private String world;

  private int[]array;

    public Class(int number, String world, int[] array) {
        this.number = number;
        this.world = world;
        this.array = array;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Class(){

    }
}
