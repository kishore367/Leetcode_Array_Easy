class OrderedStream {
    String []values;
    int ptr=0;

    public OrderedStream(int n) {
        values=new String [n];
        
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> output=new ArrayList();
        values[idKey-1]=value;

        while(ptr<values.length && values[ptr]!=null){
            output.add(values[ptr++]);
        }
        return output;
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */