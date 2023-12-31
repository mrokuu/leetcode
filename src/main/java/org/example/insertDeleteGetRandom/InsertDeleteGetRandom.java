package org.example.insertDeleteGetRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> locs;
    Random randomObj = new Random();

    public InsertDeleteGetRandom() {
        nums = new ArrayList<Integer>();
        locs = new HashMap<Integer, Integer>();
    }

    public boolean insert(int val) {
        if ( locs.containsKey(val) ) return false;
        locs.put( val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if ( ! locs.containsKey(val) ) return false;
        int loc = locs.get(val);
        if (loc < nums.size() - 1 ) {
            int lastone = nums.get(nums.size() - 1 );
            nums.set( loc , lastone );
            locs.put(lastone, loc);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    public int getRandom() {
        return nums.get( randomObj.nextInt(nums.size()) );
    }
}
