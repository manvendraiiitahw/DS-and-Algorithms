package advance.java.leetcode.subscription.neetcode.binarysearch;

import java.util.*;

public class TimeBasedKeyValueStore {
    class ValueTime {
        String value;
        int timestamp;

        public ValueTime(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<ValueTime>> map = new HashMap<>();

    public static void main(String[] args) {
        TimeBasedKeyValueStore timeBasedKeyValueStore = new TimeBasedKeyValueStore();
        timeBasedKeyValueStore.set("foo", "bar", 1);
        System.out.println(timeBasedKeyValueStore.get("foo", 1));
        System.out.println(timeBasedKeyValueStore.get("foo", 3));
        timeBasedKeyValueStore.set("foo", "bar2", 4);
        System.out.println(timeBasedKeyValueStore.get("foo", 4));
        System.out.println(timeBasedKeyValueStore.get("foo", 5));
    }

    public void set(String key, String value, int timestamp) {
        ValueTime valueTime = new ValueTime(value, timestamp);
        if (map.containsKey(key)) {
            map.get(key).add(valueTime);
        } else {
            List<ValueTime> valueTimes = new ArrayList<>();
            valueTimes.add(valueTime);
            map.put(key, valueTimes);
        }
    }

    public String get(String key, int timestamp) {
        List<ValueTime> valueTimes = map.get(key);
        if (Objects.isNull(valueTimes)) {
            return "";
        } else {
            int l = 0, r = valueTimes.size()-1;
            String res = "";
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (m <= valueTimes.size() && valueTimes.get(m).timestamp <= timestamp) {
                    res = valueTimes.get(m).value;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return res;
        }
    }
}
