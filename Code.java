//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }

long digitTreeSum(Tree<Integer> t) {
    digitTreeSum(t, 0);
    
    return run_sum;
}

long run_sum = 0;

void digitTreeSum(Tree<Integer> t, long sum){
    if(t == null)
        return;
    
    
    sum = sum * 10 + t.value;
    
    if(t.left == null && t.right == null)
    {
        run_sum += sum;
    }
    
    digitTreeSum(t.left, sum);
    digitTreeSum(t.right,sum);

}
