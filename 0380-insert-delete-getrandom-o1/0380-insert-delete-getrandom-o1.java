class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    public RandomizedSet() {
        map = new HashMap();
        list = new ArrayList();
    }
    
    public boolean insert(int val) {
        boolean result = !map.containsKey(val);
        if(result) {
            map.put(val, list.size());
            list.add(val);
        }
        return result;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int idxToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(idxToRemove, lastElement);
        map.put(lastElement, idxToRemove);
        
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int random = (int)(Math.random() * list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */