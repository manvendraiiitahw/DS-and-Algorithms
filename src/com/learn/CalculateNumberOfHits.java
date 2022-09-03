package com.learn;// Question 2:

//Design a hit counter which counts the number of hits received in the past 10 minutes.

//Your system should accept a timestamp parameter (in seconds granularity), and you may assume that calls are being made to the system in chronological order (i.e., timestamp is monotonically increasing). Several hits may arrive roughly at the same time.

// 1, 1, 1, 2, 2, 5 

// t = 6  ->    6
// t = 604 ->   1

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class CalculateNumberOfHits {
    public static int value = 0;

    static class SiteHit {
        Timestamp timeStamp;
    }

    static List<SiteHit> hitsData = new ArrayList<>();

    public static void main() {

    }

    static void insertNumberOfHit(Timestamp t) {

        SiteHit st = new SiteHit();
        st.timeStamp = Timestamp.from(Instant.now());
        hitsData.add(st);

    }

    static int getNumberOfHit(Timestamp t) {
        int lastIndex = binarySearch(hitsData, 0, hitsData.size(), t);
        t.setMinutes(t.getMinutes()-10);
        int firstIndex = binarySearch(hitsData, 0, hitsData.size(), t);
        return lastIndex - firstIndex;
    }

    static int binarySearch(List<SiteHit> hits, int l, int r, Timestamp curr) {


        int m = l + (r - l);
        if (r>=l) {

            SiteHit ss = hits.get(m);
            SiteHit bm = null;
            SiteHit am = null;

            if (ss.timeStamp.equals(curr)) {
                return m;
            }
            if (m > 0) {
                bm = hits.get(m - 1);
            }
            if (m < r) {
                am = hits.get(m + 1);
            }
            if ((curr.after(ss.timeStamp) && am.timeStamp.after(curr)) || (ss.timeStamp.after(curr) && curr.after(bm.timeStamp))) {
                return m;

            }
            if (curr.after(ss.timeStamp)) {
                binarySearch(hits, m + 1, r, curr);
            } else {
                binarySearch(hits, l, m - 1, curr);
            }

        }
        return -1;
    }


}

