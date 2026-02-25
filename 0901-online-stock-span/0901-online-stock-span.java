class StockSpanner {
    ArrayDeque<pair> stack=new ArrayDeque<>();

   
    public StockSpanner() {
      
        
    }
   public class pair{
         int price;
        int span;
       pair(int price,int span){
            this.price=price;
            this.span=span;
        }
    }
    public int next(int price) {
        
        int span=1;
        
        while(!stack.isEmpty() && price>=stack.peek().price){
            span+=stack.pop().span;
        }stack.push(new pair(price,span));
        return span;
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */