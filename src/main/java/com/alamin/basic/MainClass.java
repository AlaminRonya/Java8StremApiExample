package com.alamin.basic;
class Room {

    private int roomNo;
    String roomType;
    private float roomArea;
    private boolean acMachine;


    void setData(int roomNo, String roomType, float roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    void displayData() {
        System.out.println(
                "The room no: "+ this.roomNo+"\n"+
                        "roomType: " + this.roomType+"\n"+
                        "roomArea: " + this.roomArea+"\n"+
                        "AC machine: " + ((this.acMachine) ? "yes" : "no")+"\n"
        );


    }

}

class SimpleObject extends Room{
    public SimpleObject() {
        super();
    }
}

public class MainClass {
    public static void main(String arg[]) {
        Room room = new Room();
        room.setData(101, "Deluxe", 240.0f, true);
        room.displayData();

        SimpleObject refer =  new SimpleObject();
        refer.setData(102, "Single-family", 140.0f, false);
        refer.displayData();
        System.out.println(refer.roomType);
    }
}
