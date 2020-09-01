class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean isTrue = true;
        if(strs.length==0) {return result;}
        for (int i = 0; i < strs[0].length() ; i++) {
            char letter = strs[0].charAt(i);
            for (String string : strs ) {
                if(string.length()>i) {
                    if(string.charAt(i)!=letter) {
                        isTrue = false;
                        break;
                    }
                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                result = result.concat(String.valueOf(letter));
            } else {
                break;
            }

        }

        return result;
    }
}
