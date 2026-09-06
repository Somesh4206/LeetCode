import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        // Base case: when we hit the target
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If target becomes negative, stop exploring this path
        if (target < 0) {
            return;
        }

        // Explore all candidates starting from 'start'
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose
            backtrack(candidates, target - candidates[i], i, current, result); // Recurse (reuse allowed)
            current.remove(current.size() - 1); // Undo choice (backtrack)
        }
    }
}
