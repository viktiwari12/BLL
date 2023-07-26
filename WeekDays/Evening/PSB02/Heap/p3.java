public static void main(String[] args) {
    
}
private void dfs(TreeNode node, int target, List<Integer> currentPath, List<List<Integer>> allPaths, int currentSum) {
        if (node == null)
            return;

        currentSum += node.val;
        currentPath.add(node.val);

        if (currentSum == target && node.left == null && node.right == null) {
            allPaths.add(new ArrayList<>(currentPath));
        }

        dfs(node.left, target, currentPath, allPaths, currentSum);
        dfs(node.right, target, currentPath, allPaths, currentSum);

        currentPath.remove(currentPath.size() - 1); // Remove the current node to backtrack
    }