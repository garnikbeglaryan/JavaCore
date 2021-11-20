package newhomework;

public class CharArray {

    void  print(char[] array) {
        System.out.println(array[array.length / 2]);
        System.out.println(array[array.length / 2 - 1]);
    }

    boolean ly (char [] array){
        boolean ly = false;
        for (int i = 0; i < array.length; i++) {
            if(array[array.length -2] == 'l' && array[array.length -1] == 'y'){
                ly =true;
            }
        }
        return ly;
    }


    boolean bob (char [] array){
        boolean isbob = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]=='b' && array[i+2]=='b'){
                isbob=true;
                break;
            }
        }
        return isbob;
    }

     char []  trim (char [] array1){
        int startindex = 0;
        int endindex = array1.length -1;

        while (startindex < endindex && array1[startindex]==' '){
            startindex++;
        }

        while (startindex < endindex && array1[endindex]== ' '){
            endindex--;
        }

        char [] result = new char[(endindex - startindex) +1];

        int index = 0;
         for (int i = startindex; i <=endindex ; i++) {
             result[index++]=array1[i];
         }
         for (int i = 0; i < array1.length; i++) {


         }
         return result;
    }


    int  c (char [] text ){
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            char c = text[i];
            if (c == 'b'){
                count++;
            }
        }
        return count;
    }


}
