package leetcode.string;

public class strStr {
    public int StrStr(String haystack, String needle) {
        if(haystack==null || needle ==null){
            return 0;
        }else if (haystack.length()<needle.length()){
            return -1;
        }else {
            return haystack.indexOf(needle);
        }
    }
}
