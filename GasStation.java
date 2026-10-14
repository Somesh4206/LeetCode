package LeetCode;

public class GasStation {
	public int Station(int gas[],int cost[]) {
		int tot=0;
		int curr=0;
		int st=0;
		for(int i=0;i<gas.length;i++) {
			int diff=gas[i]-cost[i];
			tot+=diff;
			curr+=diff;
			
			if(curr<0) {
				st=i+1;
				curr=0;
			}
		}
		if(tot>=0)	return st;
		else		return -1;
	}
	public static void main(String[] args) {
		int gas[]= {1,2,3,4,5};
		int cost[]= {3,4,5,1,2};
		GasStation gs=new GasStation();
		int obj=gs.Station(gas,cost);
		System.out.println(obj);

	}

}
