
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        // https://stackoverflow.com/questions/4802015/difference-between-null-and-empty-java-string
        // if given array of Strings 'arr' DN have any Strings ... --- edge case check
        if(arr.length == 0){
            // points to nothing --- different to empty string
            return null;
        }

        // initialize some variables to later append longest String's .length() & itself
        int currentStrLength = 0;
        String currentLongest = "";
        // iterate via given 'arr' ...
        for(int i = 0; i < arr.length; ++i){
            // current String in array of Strings
            String tempStr = arr[i];
            // checking current String's length using Java built-in String.length() method to see if it's greater than what's currently recorded
            if(tempStr.length() > currentStrLength){
                // assign current String.length() to previously declared 'currentStrLength'
                currentStrLength = tempStr.length();
                // re-initialize varaible 'currentLongest' to hold the longest FOUND String for the time being
                currentLongest = tempStr;
            }
        }
        // return longest String in array of Strings 'arr'
        return currentLongest;
    }
}
