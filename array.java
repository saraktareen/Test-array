import java.util.Random;
public class array 
{
        public static void main (String[] args) 
        {
            Random random = new Random();
            int[] arr = new int [10]; //initialise array
            
            //for loop to enter values into the array
            for (int i=0; i < arr.length ; i++)
            {
                arr[i] = random.nextInt(50);
            }

            //for loop to display all the values of the array
            for (int i=0; i <arr.length; i++)
            {
                System.out.printf("arr[" + i + "] = " + arr[i] + "%n");
                sys.printf("test");
            }
        }
    }
    
