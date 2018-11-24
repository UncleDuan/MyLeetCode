class Solution {
    public int reverse(int x) {
        int result=0;
//         Stack<Integer> s=new Stack<Integer>();
//         //提取x的各个位
//         while (x%10!=0)
//         {
//             s.push(x/10);
//             x=x%10;
//         }
//         while (!s.empty())
//         {
//             result=10*s.pop();
            
//         }
        //需要提取x的各个位，然后再得到得到result
        //without the help of some auxiliary stack/array
        while (x != 0) {
        //余数
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop;
        }
        
        return result;
    }
}
