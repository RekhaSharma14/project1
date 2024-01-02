package first_project;

public class Arraycoding {

    public static void main(String[] args) {

        int [] a = {20, 65, 68, 786, 89, 100, 45, 87, 76, 99};
        for( int val:a){
            System.out.println(val);
        }



        int [] intArr = new int [20];
        for( int i=0;i< intArr.length;i++){
           intArr[i] = i + 1;
            System.out.println(intArr[i]);
        }
        for(int i = intArr.length-1;i >= 0 ;i--){
            System.out.println(intArr[i]);
        }





    }
}
