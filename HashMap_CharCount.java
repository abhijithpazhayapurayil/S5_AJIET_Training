import java.util.HashMap;
void main(){
    HashMap<Character,Integer>list=new HashMap<>();
    String arr="programming";
    for(char i : arr.toCharArray()){
        int res=list.getOrDefault(i,0);
        list.put(i,res+1);
    }
   for (char c : list.keySet()) {
            System.out.println(c + ":" + list.get(c));
        }
}
