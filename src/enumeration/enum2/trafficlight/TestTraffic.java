package enumeration.enum2.trafficlight;

import java.util.concurrent.TimeUnit;

public class TestTraffic {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.start();
    }

}

abstract class State {

    protected TrafficLight trafficLight;

    public State(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public abstract void changeState();

}

enum TrafficLightState {

    RED {
        @Override
        public TrafficLightState getNextState() {
            return YELLOW;
        }
    },

    YELLOW {
        @Override
        public TrafficLightState getNextState() {
            return GREEN;
        }
    },

    GREEN {
        @Override
        public TrafficLightState getNextState() {
            return RED;
        }
    };

    public abstract TrafficLightState getNextState();

}

class TrafficLight {

    private TrafficLightState state;

    public TrafficLight() {
        state = TrafficLightState.RED;
    }

    public void start() {
        while (true) {
            System.out.println(state.name());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = state.getNextState();
        }
    }

}
