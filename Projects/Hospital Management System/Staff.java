public class Staff extends Person {
    private String staffPost;
    private Room assignedRoom;

    public Staff(String id, String name, String staffPost) {
        super(id, name);
        this.staffPost = staffPost;
        this.assignedRoom = null;
    }

    public Room getAssignedRoom() {
        return assignedRoom;
    }

    public void setAssignedRoom(Room room) {
        this.assignedRoom = room;
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff [ID: " + getId() + ", Name: " + getName() + ", Post: " + staffPost + ", Assigned Room: " + (assignedRoom != null ? assignedRoom.getRoomType() : "N/A") + "]");
    }
}
