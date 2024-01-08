public class Room {
    private int width;
    private int length;
    public Room(int w, int l)//number variable field
    {
        this.width = w;
        this.length = l;
    }
    public void computePrice(float price)
    {
        float sqYard = (width * length);
        float amt = sqYard * price;
        System.out.println("Computing price "+ amt);
    }//end method
    public static void main(String[] args) {
        Room room = new Room(42, 25);
        room.computePrice(10.5f);
    }//end main
}//end class
