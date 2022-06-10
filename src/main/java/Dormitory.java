
import java.util.ArrayList;

public class Dormitory extends Room{
    private int capacity = 999;
    private ArrayList<Room> roomArrayList;
    public Dormitory() {
        roomArrayList = new ArrayList<>();
    }

    public void saveRooms(int num) {
        setRoomNumber(num);
        Room room = new Room(num, 0);
        roomArrayList.add(room);
    }

    public void loadRooms(int num) {

    }

    public void getFreeCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Room> getRooms() {
        return roomArrayList;
    }

}
