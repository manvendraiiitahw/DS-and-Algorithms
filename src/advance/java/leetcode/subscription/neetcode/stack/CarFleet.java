package advance.java.leetcode.subscription.neetcode.stack;

import java.util.*;

//853
public class CarFleet {
    class PositionSpeed {
        int position;
        int speed;

        public PositionSpeed(int pos, int speed) {
            this.position = pos;
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        CarFleet carFleet = new CarFleet();
        int[] pos = {6,8};
        int[] speed = {3,2};
        int target = 10;
        System.out.println(carFleet.carFleet(target, pos, speed));
    }

    public int carFleet(int target, int[] position, int[] speed) {
        List<PositionSpeed> positionSpeeds = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            positionSpeeds.add(new PositionSpeed(position[i], speed[i]));
        }
        positionSpeeds.sort(Comparator.comparingInt(o -> o.position));
        Stack<Double> stack = new Stack<>();
        for (int i = positionSpeeds.size() - 1; i >= 0; i--) {
            PositionSpeed positionSpeed = positionSpeeds.get(i);
            double f = (double) (target - positionSpeed.position) / positionSpeed.speed;
            stack.push(f);
            if (stack.size() > 1) {
                double f1 = stack.pop();
                double f2 = stack.pop();
                if (f1 <= f2) {
                    stack.add(f2);
                } else {
                    stack.add(f2);
                    stack.add(f1);
                }
            }
        }

        return stack.size();
    }
}
