package mode.simplefactory;

/**
 * @author fengfan
 * @date 2023/3/3 10:50
 * @since JDK1.8
 */
public class Chart {
    private String type;
    AbstractChart abstractChart;

    public Chart(String type) {
        this.type = type;
        if (type.equalsIgnoreCase("bar")) {
            //初始化柱状图
            abstractChart = new BarChart();
        } else if (type.equalsIgnoreCase("pie")) {
            //初始化饼状图
            abstractChart = new PieChart();
        } else if (type.equalsIgnoreCase("line")) {
            //初始化折线图
            abstractChart = new LineChart();
        }
    }

    public void display() {
        if (type.equalsIgnoreCase("bar")) {
            abstractChart.display();
        } else if (type.equalsIgnoreCase("pie")) {
            abstractChart.display();
        } else if (type.equalsIgnoreCase("line")) {
            abstractChart.display();
        }
    }
}
