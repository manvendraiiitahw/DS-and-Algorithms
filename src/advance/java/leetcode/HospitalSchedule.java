package advance.java.leetcode;

import java.util.*;

public class HospitalSchedule {
    public static void main(String[] args) {
//        int[][]A=
//        {{1,1,5,2,3},
//        {4,5,6,4,3},
//        {9,4,4,1,5}};
        int[][] A = {{4, 3}, {5, 5}, {6, 2}};
        System.out.println(solution(A));
    }

    public static int solution(int[][] A) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> nextSetOfDocIdsSet = new HashSet<>();
        Set<Integer> includedDoctor = new HashSet<>();
        int out = 0;
        for (int i = 0; i < A.length; i++) {
            st.addAll(nextSetOfDocIdsSet);
            Set<Integer> visitedSet = new HashSet<>();
            for (int j = 0; j < A[0].length; j++) {
                if (i == 0) {
                    st.add(A[i][j]);
                } else {
                    if (st.contains(A[i][j]) && !visitedSet.contains(A[i][j]) && !includedDoctor.contains(A[i][j])) {
                        out++;
                        visitedSet.add(A[i][j]);
                        includedDoctor.add(A[i][j]);
                    }
                    nextSetOfDocIdsSet.add(A[i][j]);
                }
            }
        }
        return out;
    }


//                if (integerIDMap.containsKey(A[i][j])) {
//                    ID id = new ID(i, A[i][j]);
//                    List<ID> idList = integerIDMap.get(i);
//                    idList.add(id);
//                    integerIDMap.put(i, idList);
//                } else {
//                    ID id = new ID(i, A[i][j]);
//                    List<ID> idList = new ArrayList<>();
//                    idList.add(id);
//                    integerIDMap.put(i, idList);
//                }
//            }
//            for (Map.Entry<Integer, List<ID>> listEntry: integerIDMap.entrySet()){
//                System.out.println(listEntry);
//            }
//        }
//        return 0;
//    }

    static class ID {
        int day;
        int id;

        public ID(int day, int id) {
            this.day = day;
            this.id = id;
        }
    }
}
