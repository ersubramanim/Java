package isGoodNumber;

class Solution {
    public int rotatedDigits(int N) {
        int res = 0;
        for(int i = 1; i <= N; i++){
            if(isGoodNumber(i)) {
            	System.out.print(i+"\n");
            	res++;
            }
                
        }

        return res;
    }

    public boolean isGoodNumber(int N) {
        String n = String.valueOf(N);
        char[] cs = n.toCharArray();
        for(int i = 0; i < cs.length; i++) {
            if(cs[i] == '0' || cs[i] == '1' || cs[i] == '8')
                continue;

            if(cs[i] == '6') {
                cs[i] = '9';
            } else if(cs[i] == '9') {
                cs[i] = '6';
            } else if(cs[i] == '2') {
                cs[i] = '5';
            } else if(cs[i] == '5') {
                cs[i] = '2';
            } else {
                return false;
            }
        }

        return Integer.parseInt(String.valueOf(cs)) != N;
    }
}
