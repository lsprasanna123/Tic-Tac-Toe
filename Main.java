import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i = 0;
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        int num, j = 0,total=9;
        boolean flag = true;
        int turn = 0,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1 : 1 and Player2 : 0");
        while (flag) {
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                    System.out.print("       " + arr[i][j] + "       ");
                }
                System.out.println("");
            }
            System.out.println("Enter the number to the position");
            num = scanner.nextInt();
            count++;
            if (num > 9 ) {
                System.out.println("invalid choice");
            }
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                    if (num == arr[i][j]) {
                        arr[i][j] = turn;
                        if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                            System.out.println("you won");
                            flag = false;
                        } else if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                            System.out.println("you won");
                            flag = false;
                        }
                    }
                }
            }
            turn = turn == 1 ? 0 : 1;
        }
    }
}





