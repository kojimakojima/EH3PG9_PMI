public class Room {
    private int roomNumber ;
    private int numOfstudent = 0;

    Room() {
        roomNumber = 000;
        numOfstudent = 0;
    }

    Room(int roomNumber, int numOfstudent) {
        this.roomNumber = roomNumber;
        this.numOfstudent = numOfstudent;
    }

    public void setRoomNumber(int roomNumber) {
        if(roomNumber >= 100 ) {
            if(roomNumber <= 999) {
                this.roomNumber = roomNumber;
            }
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setNumOfstudent(int numOfstudent) {
        this.numOfstudent = numOfstudent;
    }

    public int getNumOfStudents() {
        return numOfstudent;
    }

    public void addNewStudent() {
        if(numOfstudent <= 6) {
            numOfstudent += 1;
        }
    }

    public void removeStudent() {
        if(numOfstudent >= 1) {
            numOfstudent -= 1;
        }
    }

}
