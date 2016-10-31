package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

public class DemoHog {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int Globalcounter=0;
		BufferedImage image;
		int width;
		int height;
		double  Gx[][], Gy[][], G[][]; 

		File file=new File("D:/number/hog.PNG");
		image = ImageIO.read(file);
		width = image.getWidth();
		height = image.getHeight();


		int[][] imgArray=new int[width][height];
		Gx = new double[width][height];   
		Gy = new double[width][height]; 
		G  = new double[width+8][height+8];
		int[] pixels = new int[width * height];

		for(int i=0; i<width; i++){

			for(int j=0; j<height; j++){

				Color c = new Color(image.getRGB(i,j));
				int red = (int)(c.getRed() * 0.299);
				int green = (int)(c.getGreen() * 0.587);
				int blue = (int)(c.getBlue() *0.114);
				Color newColor = new Color(red+green+blue,

						red+green+blue,red+green+blue);
				int grayvalue=(newColor.getRed()+newColor.getGreen()+newColor.getBlue())/3;;
				imgArray[i][j]=grayvalue;
				//			System.out.println(grayvalue);
			}

		}

		for (int i = 8; i < width-8; i++) {


			for (int j = 8; j < height-8; j++) {




				int color=0;
				int count=0;
				double temp[]=new double[65];
				
				for (int i2 = i; i2 <i+8; i2++) {


					for (int j2 =j; j2 <j+8; j2++) {
						//						 Color newColor = new Color(color,
						//		                         
						//		                         color,color);
						//						
						//						G[i2][j2]=newColor.getRGB();
						//count++;

						if (i2==0 || i2==width-1 || j2==0 || j2==height-1) {Gx[i2][j2] = Gy[i2][j2] = G[i2][j2] = 0;}
						else{

							Gx[i2][j2]=Math.abs(imgArray[i2][j2+1])- Math.abs(imgArray[i2][j2-1]);
							Gy[i2][j2]=imgArray[i2+1][j2]-imgArray[i2-1][j2];

							double angle=Math.abs( Math.atan2(Gy[i2][j2], Gx[i2][j2]));
							//temp[count]= angle;
							temp[count]=Math.toDegrees(angle);
							//System.out.println(Math.round(temp[count]));
							count++;
							//System.out.println(Gx[i2][j2]);

						}

					}
					//count the height angle
					int temp2[]=new int[181];
					for (int k = 0; k <=180; k++) {
						int counter=0;
						for (int k2 = 0; k2 <= 64; k2++) {
							
							if(k==Math.round(temp[k2])){
								counter++;
							}
							//System.out.println(k==Math.round(temp[k2]));
							
							temp2[k]=counter;
						}
						

					}
					
					int higestangle=0;
					int histogramangle=0;
					for (int k = 1; k < temp2.length; k++) {
						
						if(temp2[k]>higestangle&&temp2[k]!=0){
							higestangle=temp2[k];
							histogramangle=k;
						}
						
					}
					System.out.println(histogramangle+""+Globalcounter++);

					
					

					color=color+30;

				}

				System.out.println(count+"all");


				


				j=j+8;

			}

			i=i+8;

		}



		BufferedImage bufferImage2=new BufferedImage(width+8, height+8,BufferedImage.TYPE_INT_RGB);

		// bufferImage2.getRaster().setPixels(0, 0, height, width, pixels);
		int c=0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int Pixel=(int) G[i][j];
				bufferImage2.setRGB(i,j,Pixel);
				c++;
			}
			//System.out.println(c);
		}
		System.out.println(imgArray.length);
		// System.out.println(c);
		File outputfile = new File("D:/number/saved2.jpg");
		ImageIO.write(bufferImage2, "jpg", outputfile);


	}

}
