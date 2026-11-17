void main(){
    String str ="Hello World";
    String [] arr=str.split(" ");
    for (String s :arr){
        System.out.println(s);
    }
    String string="";
    for (String s : arr){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }  
        System.out.println(" ");
    }
}
