package chap02;

public class Exercise5_1 {
    public static void main(String[] args) {
        //5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.

        //int[] arr[];        // arr[n]=>n에 자연수를 입력함으로써 배열의 크기를 선언할 때 입력해야한다.

        int[] arr1 = {1, 2, 3,};
        int[] arr2 = new int[5];
        //int[] arr3 = new int[5]{1,2,3,4,5}; //이 경우 []안에 숫자를 넣으면 안된다.
        //int arr4[ 5]; //선언시 크기지정 할 수 없음
        int[] arr5[] = new int[3][];

    }
}
