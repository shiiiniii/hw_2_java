//2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.


package tasks_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;
public class Program{
	
	public static void main(String[] args) throws SecurityException, IOException{
		Logger logger = Logger.getLogger(Program.class.getName());
		FileHandler fh = new FileHandler("log.txt");
		logger.addHandler(fh);
		logger.info("try");
		
		
		int [] sort = {4, 2, 5, 3, 1};
        boolean isSorted = false;
        int a;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < sort.length-1; i++) {
                if(sort[i] > sort[i+1]){
                    isSorted = false;
                    a = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
    }
    
