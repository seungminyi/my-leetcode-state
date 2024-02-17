class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String[] dirs = path.split("/");
        for(String dir : dirs) {
            if(dir.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else{
                if(!dir.equals(".") && !dir.isEmpty()) {
                    stack.push(dir);
                }
            }
        }
        
        
        if(stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.removeLast());
        }
        
        return sb.toString();
    }
}