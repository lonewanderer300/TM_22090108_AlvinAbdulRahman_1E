import java.util.ArrayList;

public class TM_22090108_AlvinAbdulRahman_1E {public static void main(String[] args) {
    ArrayList<int[]> StopGo=new ArrayList<int[]>();
    StopGo.add(new int[]{10,0});
    StopGo.add(new int[]{3,5});
    StopGo.add(new int[]{2,5});
    System.out.println(GetPassenger(StopGo));
}public static int GetPassenger(ArrayList<int[]>biskota){
    return (biskota.get(0)[0] - biskota.get(0)[1])+(biskota.get(1)[0]-biskota.get(1)[1])+(biskota.get(2)[0]-biskota.get(2)[1]);
}
}
