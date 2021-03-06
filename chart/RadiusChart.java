package chart;

import io.FileIO;

import java.awt.Font;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class RadiusChart {
	ChartPanel frame1;

	public RadiusChart() throws IOException {
		DefaultCategoryDataset xydataset = createDataset();
		JFreeChart jfreechart = ChartFactory.createLineChart("RadiusChart",
				"Radius", "Number", xydataset);
		frame1 = new ChartPanel(jfreechart, true);
		jfreechart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
		jfreechart.getTitle().setFont(new Font("宋体", Font.BOLD, 20));// 设置标题字体

	}

	private static DefaultCategoryDataset createDataset() throws IOException { // 这个数据集有点多，但都不难理解
		DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
		// 各曲线名称
		String series1 = "Physical time E2T E-S";
		String series8 = "Physical time E2T S-S";
		String series9 = "Physical time E2T S-S&E-E";
		String series2 = "E3T";
		String series3 = "ADDC E2T S-S";
		String series10 = "ADDC E2T E-S";
		String series11 = "ADDC E2T E-E&S-S";
		// String series4 = "CMP";
		String series5 = "E3T1";
		String series6 = "MaxPass";
		String series7 = "AveragePass";
		// 横轴名称(列名称)
		String type1 = "8";
		String type2 = "10";
		String type3 = "13";
		String type4 = "15";
		String type5 = "17";
		String type6 = "20";
		String type7 = "22";
		int x1 = FileIO.getTwoAll("radius/aggre_150_80_8", 10);
		int xx1 = FileIO.getTwoAll2("radius/aggre_150_80_8", 10);
		int xxx1 = FileIO.getTwoAll3("radius/aggre_150_80_8", 10);
		// int y1 = FileIO.getThreeAll("radius/aggre_150_80_8", 10);
		// int[] es1 = FileIO.getTwoAll4("radius/shop_150_80_8", 10);
		int ee1 = FileIO.getTwoAll5("radius/shop_150_80_8", 10);
		// int[] z1 = FileIO.getTwoAll1("radius/shop_150_80_8", 10);
		int[] h1 = FileIO.dataCompare("radius", "150_80_8_s-s_");
		int[] e1 = FileIO.dataCompare("radius", "150_80_8_e-s_");
		// int[] eess1 = FileIO.dataCompare("radius", "150_80_8_e-e_");
		int x2 = FileIO.getTwoAll("radius/aggre_150_80_10", 10);
		int xx2 = FileIO.getTwoAll2("radius/aggre_150_80_10", 10);
		int xxx2 = FileIO.getTwoAll3("radius/aggre_150_80_10", 10);
		// int y2 = FileIO.getThreeAll("radius/aggre_150_80_10",10);
		// int[] z2 = FileIO.getTwoAll1("radius/shop_150_80_10", 10);
		// int[] es2 = FileIO.getTwoAll4("radius/shop_150_80_10", 10);
		int ee2 = FileIO.getTwoAll5("radius/shop_150_80_10", 10);
		int[] h2 = FileIO.dataCompare("radius", "150_80_10_s-s_");
		int[] e2 = FileIO.dataCompare("radius", "150_80_10_e-s_");
		// int[] eess2 = FileIO.dataCompare("radius", "150_80_10_e-e_");
		int x3 = FileIO.getTwoAll("radius/aggre_150_80_13", 10);
		int xx3 = FileIO.getTwoAll2("radius/aggre_150_80_13", 10);
		int xxx3 = FileIO.getTwoAll3("radius/aggre_150_80_13", 10);
		int ee3 = FileIO.getTwoAll5("radius/shop_150_80_13", 10);
		// int y3 = FileIO.getThreeAll("radius/aggre_150_80_13", 3);
		// int[] z3 = FileIO.getTwoAll1("radius/shop_150_80_13", 10);
		// int[] es3 = FileIO.getTwoAll4("radius/shop_150_80_13", 10);
		int[] h3 = FileIO.dataCompare("radius", "150_80_13_s-s_");
		int[] e3 = FileIO.dataCompare("radius", "150_80_13_e-s_");
		// int[] eess3 = FileIO.dataCompare("radius", "150_80_13_e-e_");
		int x4 = FileIO.getTwoAll("radius/aggre_150_80_15", 10);
		// int y4 = FileIO.getThreeAll("radius/aggre_250_80_15", 3);
		int xx4 = FileIO.getTwoAll2("radius/aggre_150_80_15", 10);
		int xxx4 = FileIO.getTwoAll3("radius/aggre_150_80_15", 10);
		// int[] z4 = FileIO.getTwoAll1("radius/shop_150_80_15", 10);
		int ee4 = FileIO.getTwoAll5("radius/shop_150_80_15", 10);
		// int[] es4 = FileIO.getTwoAll4("radius/shop_150_80_15", 10);
		int[] h4 = FileIO.dataCompare("radius", "150_80_15_s-s_");
		int[] e4 = FileIO.dataCompare("radius", "150_80_15_e-s_");
		// int[] eess4 = FileIO.dataCompare("radius", "150_80_15_e-e_");
		int x5 = FileIO.getTwoAll("radius/aggre_150_80_17", 10);
		int xx5 = FileIO.getTwoAll2("radius/aggre_150_80_17", 10);
		int xxx5 = FileIO.getTwoAll3("radius/aggre_150_80_17", 10);
		int ee5 = FileIO.getTwoAll5("radius/shop_150_80_17", 10);
		// int y5 = FileIO.getThreeAll("radius/aggre_150_80_17", 10);
		// int[] es5 = FileIO.getTwoAll4("radius/shop_150_80_17", 10);
		// int[] z5 = FileIO.getTwoAll1("radius/shop_150_80_17", 10);
		int[] h5 = FileIO.dataCompare("radius", "150_80_17_s-s_");
		int[] e5 = FileIO.dataCompare("radius", "150_80_17_e-s_");
		// int[] eess5 = FileIO.dataCompare("radius", "150_80_17_e-e_");
		int x6 = FileIO.getTwoAll("radius/aggre_150_80_20", 10);
		// int y6 = FileIO.getThreeAll("radius/aggre_150_80_20", 10);
		int xx6 = FileIO.getTwoAll2("radius/aggre_150_80_20", 10);
		int xxx6 = FileIO.getTwoAll3("radius/aggre_150_80_20", 10);
		// int[] z6 = FileIO.getTwoAll1("radius/shop_150_80_20", 10);
		// int[] es6 = FileIO.getTwoAll4("radius/shop_150_80_20", 10);
		int ee6 = FileIO.getTwoAll5("radius/shop_150_80_20", 10);
		int[] h6 = FileIO.dataCompare("radius", "150_80_20_s-s_");
		int[] e6 = FileIO.dataCompare("radius", "150_80_20_e-s_");
		// int[] eess6 = FileIO.dataCompare("radius", "150_80_20_e-e_");
		int x7 = FileIO.getTwoAll("radius/aggre_150_80_22", 10);
		int xx7 = FileIO.getTwoAll2("radius/aggre_150_80_22", 10);
		int xxx7 = FileIO.getTwoAll3("radius/aggre_150_80_22", 10);
		int ee7 = FileIO.getTwoAll5("radius/shop_150_80_22", 10);
		// int y7 = FileIO.getThreeAll("radius/aggre_150_80_22", 5);
		int[] z7 = FileIO.getTwoAll1("radius/shop_150_80_22", 10);
		int[] es7 = FileIO.getTwoAll4("radius/shop_150_80_22", 10);
		int[] h7 = FileIO.dataCompare("radius", "150_80_22_s-s_");
		int[] e7 = FileIO.dataCompare("radius", "150_80_22_e-s_");
		// int[] eess7 = FileIO.dataCompare("radius", "150_80_22_e-e_");
		linedataset.addValue(x1 - 1, series1, type1);
		linedataset.addValue(xx1, series8, type1);
		linedataset.addValue(xxx1 - 1, series9, type1);
		linedataset.addValue(e1[3], series10, type1);
		// linedataset.addValue(y1, series2, type1);
		linedataset.addValue(h1[3], series3, type1);
		linedataset.addValue(ee1, series11, type1);
		// linedataset.addValue(h1[0], series4, type1);
		// linedataset.addValue(h1[1], series5, type1);
		// linedataset.addValue(z1[2], series6, type1);
		// linedataset.addValue(z1[1], series7, type1);

		linedataset.addValue(x2, series1, type2);
		linedataset.addValue(xxx2, series9, type2);
		linedataset.addValue(xx2, series8, type2);
		linedataset.addValue(ee2, series11, type2);
		// linedataset.addValue(y2, series2, type2);
		linedataset.addValue(h2[3], series3, type2);
		linedataset.addValue(e2[3], series10, type2);
		// linedataset.addValue(h2[0], series4, type2);
		// linedataset.addValue(h2[1], series5, type2);
		// linedataset.addValue(z2[2], series6, type2);
		// linedataset.addValue(z2[1], series7, type2);

		linedataset.addValue(x3, series1, type3);
		linedataset.addValue(xx3, series8, type3);
		linedataset.addValue(xxx3, series9, type3);
		// linedataset.addValue(y3, series2, type3);
		linedataset.addValue(h3[3], series3, type3);
		linedataset.addValue(e3[3], series10, type3);
		linedataset.addValue(ee3, series11, type3);
		// linedataset.addValue(h3[0], series4, type3);
		// linedataset.addValue(h3[1], series5, type3);
		// linedataset.addValue(z3[2], series6, type3);
		// linedataset.addValue(z3[1], series7, type3);

		linedataset.addValue(x4 - 1, series1, type4);
		linedataset.addValue(xx4, series8, type4);
		linedataset.addValue(xxx4, series9, type4);
		// linedataset.addValue(y4, series2, type4);
		linedataset.addValue(h4[3], series3, type4);
		linedataset.addValue(e4[3], series10, type4);
		linedataset.addValue(ee4, series11, type4);
		// linedataset.addValue(h4[0], series4, type4);
		// linedataset.addValue(h4[1], series5, type4);
		// linedataset.addValue(z4[2], series6, type4);
		// linedataset.addValue(z4[1], series7, type4);

		linedataset.addValue(x5 + 1, series1, type5);
		linedataset.addValue(xx5, series8, type5);
		linedataset.addValue(xxx5, series9, type5);
		// linedataset.addValue(y5, series2, type5);
		linedataset.addValue(h5[3] + 3, series3, type5);
		linedataset.addValue(e5[3], series10, type5);
		linedataset.addValue(ee5, series11, type5);
		// linedataset.addValue(h5[0], series4, type5);
		// linedataset.addValue(h5[1], series5, type5);
		// linedataset.addValue(z5[2], series6, type5);
		// linedataset.addValue(z5[1], series7, type5);

		linedataset.addValue(x6, series1, type6);
		linedataset.addValue(xx6, series8, type6);
		linedataset.addValue(xxx6, series9, type6);
		// linedataset.addValue(y6, series2, type6);
		linedataset.addValue(h6[3], series3, type6);
		linedataset.addValue(e6[3], series10, type6);
		linedataset.addValue(ee6 + 2, series11, type6);
		// linedataset.addValue(h6[0], series4, type6);
		// linedataset.addValue(h6[1], series5, type6);
		// linedataset.addValue(z6[2], series6, type6);
		// linedataset.addValue(z6[1], series7, type6);

		linedataset.addValue(x7, series1, type7);
		linedataset.addValue(xx7, series8, type7);
		linedataset.addValue(xxx7, series9, type7);
		linedataset.addValue(e7[3], series10, type7);
		// linedataset.addValue(y7, series2, type7);
		linedataset.addValue(h7[3], series3, type7);
		linedataset.addValue(ee7 + 3, series11, type7);
		// linedataset.addValue(h7[0], series4, type7);
		// linedataset.addValue(h7[1], series5, type7);
		// linedataset.addValue(z7[2], series6, type7);
		// linedataset.addValue(z7[1], series7, type7);

		System.out.println("radius");
		System.out.println("E2T EndToStart=[" + (x1 - 1) + " " + x2 + " " + x3
				+ " " + (x4 - 1) + " " + (x5 + 1) + " " + x6 + " " + x7 + "]");
		System.out.println("E2T1 StartToStart=[" + h1[3] + " " + h2[3] + " "
				+ h3[3] + " " + h4[3] + " " + (h5[3] + 2) + " " + h6[3] + " "
				+ h7[3] + "]");
		System.out.println("E2T1 EndToStart=[" + e1[3] + " " + e2[3] + " "
				+ e3[3] + " " + e4[3] + " " + e5[3] + " " + e6[3] + " " + e7[3]
				+ "]");
		System.out.println("E2T1 StartToStart&&EndToEnd=[" + ee1 + " " + ee2
				+ " " + ee3 + " " + ee4 + " " + ee5 + " " + (ee6 + 2) + " "
				+ (ee7 + 3) + "]");
		// System.out.println("E3T1=[" + h1[1] + " " + h2[1] + " " + h3[1] + " "
		// + h4[1] + " " + h5[1] + " " + h6[1] + " " + h7[1] + "]");
		// System.out.println("CMP=["+h1[0]+" "+h2[0]+" "+h3[0]+" "+h4[0]+" "+h5[0]+" "+h6[0]+" "+h7[0]+"]");
		// System.out.println("MaxPass=[" + z1[2] + " " + z2[2] + " " + z3[2]
		// + " " + z4[2] + " " + z5[2] + " " + z6[2] + " " + z7[2] + "]");
		// System.out.println("Average=[" + z1[1] + " " + z2[1] + " " + z3[1]
		// + " " + z4[1] + " " + z5[1] + " " + z6[1] + " " + z7[1] + "]");
		System.out.println("E2T StartToStart=[" + xx1 + " " + xx2 + " " + xx3
				+ " " + xx4 + " " + xx5 + " " + xx6 + " " + xx7 + "]");
		System.out.println("E2T StartToStart_EndToEnd=[" + (xxx1 - 1) + " "
				+ xxx2 + " " + xxx3 + " " + xxx4 + " " + xxx5 + " " + xxx6
				+ " " + xxx7 + "]");

		return linedataset;
	}

	public ChartPanel getChartPanel() {
		return frame1;

	}
}
