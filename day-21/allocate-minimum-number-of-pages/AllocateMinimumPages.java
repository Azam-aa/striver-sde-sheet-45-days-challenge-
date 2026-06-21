public class AllocateMinimumPages {

    static boolean possible(
            int[] arr,
            int students,
            int pages){

        int count = 1;
        int sum = 0;

        for(int num : arr){

            if(sum + num <= pages){

                sum += num;

            }else{

                count++;

                sum = num;
            }
        }

        return count <= students;
    }

    static int allocate(
            int[] arr,
            int students){

        int low = 0;
        int high = 0;

        for(int num : arr){

            low =
                Math.max(
                    low,
                    num
                );

            high += num;
        }

        while(low <= high){

            int mid =
                low +
                (high-low)/2;

            if(possible(
                    arr,
                    students,
                    mid)){

                high = mid - 1;

            }else{

                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args){

        int[] books =
            {12,34,67,90};

        System.out.println(
            allocate(
                books,
                2
            )
        );
    }
}