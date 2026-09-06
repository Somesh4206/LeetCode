import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates and enable pruning
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursion depth
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If the current number exceeds the remaining target, break (no need to continue)
            if (candidates[i] > target) break;

            current.add(candidates[i]);
            // Move to next index (i + 1) since each number can only be used once
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
