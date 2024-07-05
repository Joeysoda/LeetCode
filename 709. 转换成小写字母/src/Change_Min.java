/**
 * Description:
 * Date: 2024-07-05
 * Time: 17:23
 */
class Solution{
    public  String Change_Min(String s){
        //为了拼接,使用Stringbuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //遍历字符串s  用charAt获取每个char ch
            char ch = s.charAt(i);
            //用isLetter判断是不是字母
            if(Character.isLetter(ch)){
                //如果是字母,判断是不是大小写
                if(!Character.isLowerCase(ch)){
                    //如果是小写,acsic+32
                    ch = (char)(ch+32);
                }
            }
            //把每个char拼接起来
            stringBuilder.append(ch);
        }
        //返回stringBuilder
        return stringBuilder.toString();
    }
}
