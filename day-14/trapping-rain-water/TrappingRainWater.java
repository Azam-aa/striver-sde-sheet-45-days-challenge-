import java.util.*;

public class TrappingRainWater {

    public static int trap(
            int[] height){

        int left = 0;
        int right =
            height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while(left <= right){

            if(height[left]
                <= height[right]){

                if(height[left]
                    >= leftMax){

                    leftMax =
                        height[left];

                }else{

                    water +=
                        leftMax -
                        height[left];
                }

                left++;

            }else{

                if(height[right]
                    >= rightMax){

                    rightMax =
                        height[right];

                }else{

                    water +=
                        rightMax -
                        height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr =
            new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(
            trap(arr)
        );

        sc.close();
    }
}