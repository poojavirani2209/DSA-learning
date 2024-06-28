package org.example;

public class MoveZeroesToEnd {
    public int[] move(int[] array)
    {
        int index=0;
        int[] arrayWithZeroesAtEnd = new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                arrayWithZeroesAtEnd[index]=array[i];
                index++;
            }
        }
        for(int i=index;i<arrayWithZeroesAtEnd.length;i++){
            arrayWithZeroesAtEnd[index]=0;
        }
        return arrayWithZeroesAtEnd;
    }
    public static void main(String[] args) {
        MoveZeroesToEnd moveZeroesToEnd = new MoveZeroesToEnd();
        new PrintElements().print(moveZeroesToEnd.move(new int[]{0,0,0,1,1,1}));
    }
}
