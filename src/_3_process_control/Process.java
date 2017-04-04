/**
 * 流程控制
 */
public class Process {
    public static void main(String[] args) {
        int num = 10;

        // 分支结构: if...else, if...else if...else, switch...case...default
        if (num > 10) {
            num++;
        } else {
            num--;
        }

        switch (num) {
        case 10:
            num++;
            break;
        default:
            num--;
        }

        // 循环结构 for, foreach, while, do...while
        int[] arr = { 1, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int value : arr) {
            System.out.println(value);
        }

    }
}