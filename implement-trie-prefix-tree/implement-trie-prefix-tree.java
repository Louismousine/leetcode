class Trie {
    HashMap<Character, Trie> map = new HashMap<>();
    Character value = null;
    boolean end = false;
    /** Initialize your data structure here. */
    public Trie() {
        
    }
    public Trie(char a){
        this.value = a;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        // if(word.length()==1 && word.charAt(0)==value){
        //     end = true;return;
        // }
        if(word.length()==0){
            end=true;return;
        }
        if(map.containsKey(word.charAt(0))){
            map.get(word.charAt(0)).insert(word.substring(1));
        }else{
            Trie t = new Trie(word.charAt(0));
            map.put(word.charAt(0),t);
            t.insert(word.substring(1));
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word.length()==0 && end==true) return true;
        if(word.length()==0) return false;
        if(map.containsKey(word.charAt(0))){
            return map.get(word.charAt(0)).search(word.substring(1));
        } return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        if(word.length()==0) return true;
        if(map.containsKey(word.charAt(0))){
            return map.get(word.charAt(0)).startsWith(word.substring(1));
        } return false;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */