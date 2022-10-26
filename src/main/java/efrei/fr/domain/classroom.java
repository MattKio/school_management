package efrei.fr.domain;

public class classroom {
    private String roomNumber;
    private int size;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public classroom(String roomNumber, int size) {
        this.roomNumber = roomNumber;
        this.size = size;
    }

    public classroom() {
    }

    @Override
    public String toString() {
        return "classroom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", size=" + size +
                '}';
    }
}
