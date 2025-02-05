# Quicksort Algorithm

Quicksort is a divide-and-conquer algorithm for sorting an array. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

## Usage

To use the `Quicksort` class, follow these steps:

1. Create an instance of the `Quicksort` class.
2. Call the `quicksort` method with the array you want to sort.

Example:

```java
public class Main {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        Quicksort quicksort = new Quicksort();
        quicksort.quicksort(array);
        System.out.println(Arrays.toString(array));
    }
}
```
