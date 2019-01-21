/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_pl1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author Rewas
 */
public class Barchart extends ApplicationFrame{
    
    static String ChartTitle = "";
    protected  String Explain;
    protected  String Explain_2;

    public Barchart() {
        super(null);
    }
    public Barchart(String title,String [] Names , int [] Use, String Explain, String Explain_2 ) {
        super(title);
        Barchart.ChartTitle=title;
        this.Explain=Explain;
        this.Explain_2=Explain_2;
        final CategoryDataset dataset=createdataset(Names,Use,Explain_2);
        final JFreeChart chart= CreateChart(dataset,Explain);
        final ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
        
        try {

            saveToFile(chart, 900, 650, 100);

        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
    public static void saveToFile(JFreeChart chart, int width, int height, double quality)
            throws FileNotFoundException, IOException {
        BufferedImage img = draw(chart, width, height);

        File outputfile = new File(System.getProperty("user.dir") + "/" + ChartTitle + "_savedChart.png");
        ImageIO.write(img, "png", outputfile);

    }
    
    protected static BufferedImage draw(JFreeChart chart, int width, int height) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();

        chart.draw(g2, new Rectangle2D.Double(0, 0, width, height));

        g2.dispose();
        return img;
    }
    
    protected CategoryDataset createdataset (String [] Names , int [] Use,String Explain_2)
    {
        final String series = Explain_2;
        final DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        for(int i =0 ; i<Names.length;i++)
        {
            dataset.addValue(Use[i], series, Names[i]);
            
        }
        return dataset;
            
    }

    protected JFreeChart CreateChart(CategoryDataset dataset,String Explain) {
        final JFreeChart chart =ChartFactory.createBarChart(ChartTitle, "Car Name", Explain, dataset, PlotOrientation.VERTICAL,true,true,false );
    chart.setBackgroundPaint(Color.white);
    final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        plot.getRenderer().setSeriesPaint(0, Color.green);
        plot.getRenderer().setSeriesPaint(1, Color.yellow);
        plot.getRenderer().setSeriesPaint(2, Color.red);
        //plot.getRenderer().setSeriesPaint( 3, Color.red);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setUpperMargin(0.15);

        // disable bar outlines...
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setSeriesItemLabelsVisible(0, Boolean.TRUE);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        Font f = new Font("TimesRoman", Font.BOLD, 14);
        Font f1 = new Font("TimesRoman", Font.PLAIN, 12);

        domainAxis.setLabelFont(f);
        domainAxis.setTickLabelFont(f1);

        rangeAxis.setLabelFont(f);

        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,
                TextAnchor.HALF_ASCENT_CENTER);
        renderer.setBasePositiveItemLabelPosition(position);

        return chart;

    
    }
    
}
