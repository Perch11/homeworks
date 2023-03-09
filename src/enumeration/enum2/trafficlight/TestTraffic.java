package enumeration.enum2.trafficlight;

import java.util.concurrent.TimeUnit;

public class TestTraffic {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.start();
    }

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

    public TrafficLightState state;

    public TrafficLight() {
        state = TrafficLightState.RED;
    }

    /**
     * this method starts traffic test
     */
    public void start() {
        int count = 0;
        while (true) {
            System.out.println(state.name());
            if (state.ordinal() == 1) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                state = state.getNextState();
            }else if(state.ordinal() == 2){
                try {
                    TimeUnit.SECONDS.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                state = state.getNextState();
            }else{
                try {
                    TimeUnit.SECONDS.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                state = state.getNextState();
            }
        }
    }

}
