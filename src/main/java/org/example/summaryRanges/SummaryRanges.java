package org.example.summaryRanges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                result.add(formatRange(start, end));
                start = end = nums[i];
            }
        }

        result.add(formatRange(start, end));

        return result;
    }

    private static String formatRange(int start, int end) {
        return (start == end) ? Integer.toString(start) : start + "->" + end;
    }
}
