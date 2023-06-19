public class l003 {
    public static void main(String[] args) {
        
    }
    public static void  fun(char arr[][], String [] words, int curr){
        // base case 
        if(curr == words.length){
            display(arr);
            return ;
        }
        String word = words[curr];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                // first check-> can we even place here or not? 
                if(arr[i][j] == '-' || arr[i][j] == word.charAt(0)){
                    // first check if we can Place horizontally
                    if(canPlaceHorizon(arr, i, j, word)){
                        // place it 
                        PlaceHorizontally(arr, i, j, word);
                        fun(arr, words, curr+1);
                        UnPlaceHorizontally(arr, i, j, word);
                    }

                    if(canVertically(arr, i, j, word)){
                        // place it 
                        PlaceVertically(arr, i, j, word);
                        fun(arr, words, curr+1);
                        UnPlacevertically(arr, i, j, word);
                    }

                }
            }
        }
    }
    public static void UnPlaceHorizontally(char[][] arr, int i, int j, String word){

    }
    public static void UnPlacevertically(char[][] arr, int i, int j, String word){
        
    }
    public static boolean canPlaceHorizon(char[][] arr, int i, int j, String word){
        return false;
    }
    public static boolean canVertically(char[][] arr, int i, int j, String word){
        return false;
    }
    public static void PlaceHorizontally(char[][] arr, int i, int j, String word){

    }
    public static void PlaceVertically(char[][] arr, int i, int j, String word){

    }
    public static void display(char[][] arr){

    }
}


9717970966
