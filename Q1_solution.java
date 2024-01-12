class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(); // created a hashset which stores all the vowels in both upper and lower case
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int len = s.length();
        int mid = len /2;
        String firstHalf = s.substring(0, mid); // divided the string into two halves
        String secondHalf = s.substring(mid);
        return vowelCount(firstHalf, vowels) == vowelCount(secondHalf, vowels); // calling the function to check if they contains same number of vowels
    }
    int vowelCount(String str, Set<Character> vowels){
        int count = 0;
        for(char c : str.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }
        return count;
    }
}
