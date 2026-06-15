import java.util.*;

class Item {

    int value;
    int weight;

    Item(
        int value,
        int weight
    ){
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {

    public static void main(String[] args){

        Item[] items = {

            new Item(60,10),
            new Item(100,20),
            new Item(120,30)
        };

        int W = 50;

        Arrays.sort(
            items,
            (a,b) ->
            Double.compare(
                (double)b.value /
                b.weight,

                (double)a.value /
                a.weight
            )
        );

        double profit = 0;

        for(Item item : items){

            if(W >= item.weight){

                profit += item.value;

                W -= item.weight;

            }else{

                profit +=
                    ((double)item.value
                    / item.weight)
                    * W;

                break;
            }
        }

        System.out.println(
            profit
        );
    }
}