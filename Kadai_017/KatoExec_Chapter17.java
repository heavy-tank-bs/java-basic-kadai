package Kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		KatoTaro_Chapter17 Taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
		
		Taro.setGivenName();
		Taro.execIntroduce();
				
		Ichiro.setGivenName();
		Ichiro.execIntroduce();
		
		hanako.setGivenName();
		hanako.execIntroduce();
		
	}

}
