package com.npru.se65.id65001;
public class TestDriver {

	public static void main(String[] args) {
//		HumanBeing hb1 = new HumanBeing();
//		hb1.setHeight(175);
//		hb1.setWeight(53);
//		BmiIndexer bi1 = new BmiIndexer();
//		hb1.setBmi(bi1.calculateBMI(hb1.getHeight(), hb1.getWeight()));
//		System.out.println(hb1.getBmi());
//		HealthAnalyzer ha1 = new HealthAnalyzer();		
//		System.out.println(ha1.analyzeBmi(hb1.getBmi()));
		
		HumanBeing hb = new HumanBeing();
		hb.setHeight(175);
		hb.setWeight(55);
		hb.calculateBMI();
		System.out.println("BIM :"+hb.getBmi());
		System.out.println (hb.analyzeBmi());
		}
}
