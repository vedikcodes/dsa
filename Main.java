//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main ArrayUtil = new Main(); //instance of main class
        ArrayUtil.arrayDemo();//calling arrayDemo method

    }
    public static int arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] =  5;
        myArray[1] = 6 ;
        myArray[2] = 8 ;
        myArray[3] = 10 ;
        myArray[4] = 9 ;

        System.out.println(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
        return 1 ;
    }
        public void printArray(int[] arr)
        {
            int n = arr.length;
            for(int i=0 ;i<=n ; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

    }
