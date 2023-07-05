package com.alamin.sdlc_pro;

public class Test {
    enum TrafficLight{

        GREEN("go"),
        AMBER("slow"),
        RED("stop");
        private final String message;
        TrafficLight(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        TrafficLight greenLight = TrafficLight.AMBER;
        System.out.println(greenLight.getMessage());
    }
}
