import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<String>> result = new ArrayList<>();
    ArrayList<String> tmp = new ArrayList<>();
    public List<List<String>> partition(String s) {


        return result;


    }
    public void backTrack(String s, int l){
        if (tmp.size() > 0 && l >= s.length()){
            List<String> r = (ArrayList<String>) tmp.clone();
            result.add(r);
        }
    }



}