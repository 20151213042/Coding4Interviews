/*
面试题04. 二维数组中的查找

在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的
一个二维数组和一个整数，判断数组中是否含有该整数。

 */

public class Interview_04 {
    //遍历法
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean flag = false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (target == matrix[i][j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean flag = findNumberIn2DArray(matrix, 5);
    }
}
