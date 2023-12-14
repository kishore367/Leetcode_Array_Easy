class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str=new StringBuilder();
        for(String word:words){
            char ch=word.charAt(0);
            str.append(ch);
        }
        if(str.toString().equals(s)){
            return true;
        }
        return false;
        
    }
}