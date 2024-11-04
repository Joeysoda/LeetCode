/**
 * Description:统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 * 故地重游
 * Date: 2024-07-05
 * Time: 19:35
 */
class Solution {
    public int countSegments(String s) {

        //判断只有一个""
        if (s.length() ==0){
            return 0;
        }
        //判断"abc,      ,  d ,d"这种情况
        String []ret = s.split(" ");
        int count = 0;
        for(String x : ret){
            if(x.length()!=0){
                count++;
            }
        }
        return count;
    }
}