public class Homework {
    public static void main(String args[]) {

        short sa,sb,sc;
        sa = 1;
        sb = 2;

        //sc를 int형으로 저장해주기 위해서 short형으로 바꿔준다
        sc = (short)(sa+sb);
        System.out.println("sc:"+ sc);
    }
}