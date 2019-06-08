import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);
        System.out.println("Before sorting:");
        afisare(array);
        sort(array);
        System.out.println("After sorting:");
        afisare(array);

    }

    private static void sort (int[] array){
        for(int i=0; i<array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]) {     // for decreasing order:    if (array[i]<array[j])
                    int aux = array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
    }

    private static void afisare(int[] array){
        for(int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static int[] getArray(Scanner input) {
        System.out.println("Insert elements separated by space: ");
        String line = input.nextLine();
        String[] elements = line.split(" ");
        int[] array = new int[elements.length];
        for(int i=0; i<elements.length; i++){
            array[i]=Integer.valueOf(elements[i]);
        }
        return array;
    }
}
