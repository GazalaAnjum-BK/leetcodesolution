class Solution {
    String fun(String s){
         Stack<Character> stack=new Stack<>();
         for(char ch:s.toCharArray()){
            if(ch!='#') stack.push(ch);
            else if(!stack.empty()) stack.pop();
         }
         char [] res=new char[stack.size()];
         for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
         }
         return new String(res);

    }
    public boolean backspaceCompare(String s, String t) {
        return fun(s).equals(fun(t));

        
    }
}