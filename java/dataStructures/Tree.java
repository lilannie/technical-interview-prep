package dataStructures;

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
public class Tree<T> {
    public T value;
    public Tree<T> left;
    public Tree<T> right;

    public Tree(T x) {
     value = x;
    }
}
