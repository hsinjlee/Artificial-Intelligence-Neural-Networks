

public class HopfieldNetworkApp {
	public static void main(String[] args) {
		HopfieldNetwork hopfieldNetwork = new HopfieldNetwork(4);
		hopfieldNetwork.train(new double[]{1,0,1,0});
		hopfieldNetwork.train(new double[]{1,0,1,1});
		hopfieldNetwork.recall(new double[]{1,0,1,1});
	}
}
/*
Pattern recognized...
 */