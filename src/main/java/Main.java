
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karol
 */
public class Main {
  
    public static BufferedImage[] channels = new BufferedImage[5];

    public static void main(String[] args) throws IOException {
        new MainWindow_GUI().setVisible(true);
    }

    public static void process(BufferedImage RAW) throws IOException {

        BufferedImage[] framelets1 = new BufferedImage[RAW.getHeight() / 3];

        BufferedImage[] framelets2 = new BufferedImage[RAW.getHeight() / 3];

        BufferedImage[] framelets3 = new BufferedImage[RAW.getHeight() / 3];

        BufferedImage[] framelets4 = new BufferedImage[RAW.getHeight() / 3];

        BufferedImage[] framelets5 = new BufferedImage[RAW.getHeight() / 3];

        
        int alreadyDone1 = 0;

        int alreadyDone2 = 0;

        int alreadyDone3 = 0;

        int alreadyDone4 = 0;

        int alreadyDone5 = 0;

        int currentHeight = 8;  //start at 8 pix

        BufferedImage img;
        while (currentHeight < RAW.getHeight() / 2) {

            for (int i = 1; i < 6; i++) //slice and save all
            {
                img = RAW.getSubimage(0, currentHeight, RAW.getWidth(), 14);
                currentHeight += 14;
                switch (i) {
                    case 1:
                        // System.out.println("SAVED 1");
                        framelets1[alreadyDone1] = img;
                        alreadyDone1++;
                        break;
                    case 2:
                        //System.out.println("SAVED 2");
                        framelets2[alreadyDone2] = img;
                        alreadyDone2++;
                        break;
                    case 3:
                        //System.out.println("SAVED 3");
                        framelets3[alreadyDone3] = img;
                        alreadyDone3++;
                        break;
                    case 4:
                        //System.out.println("SAVED 4");
                        framelets4[alreadyDone4] = img;
                        alreadyDone4++;
                        break;
                    case 5:
                        //System.out.println("SAVED 5");
                        framelets5[alreadyDone5] = img;
                        alreadyDone5++;
                        break;
                    default:
                        break;
                }
            }
            currentHeight += 8;

        }
 
        channels[0] = frameletsAssembly(framelets1, RAW.getWidth(), RAW.getHeight());

        channels[1] = frameletsAssembly(framelets2, RAW.getWidth(), RAW.getHeight());

        channels[2] = frameletsAssembly(framelets3, RAW.getWidth(), RAW.getHeight());

        channels[3] = frameletsAssembly(framelets4, RAW.getWidth(), RAW.getHeight());

        channels[4] = frameletsAssembly(framelets5, RAW.getWidth(), RAW.getHeight());

        if (MainWindow_GUI.AlignChannelsCheckBox.isSelected()) {
            channels[0] = translateImage(0, channels[0]);
            channels[1] = translateImage(21, channels[1]);
            channels[2] = translateImage(42, channels[2]);
            channels[3] = translateImage(63, channels[3]);
            channels[4] = translateImage(84, channels[4]);
        }

        MainWindow_GUI.PrevLabel.setIcon(new ImageIcon(Main.channels[0]));
        MainWindow_GUI.CH1Button.setSelected(true);

    }

    static BufferedImage translateImage(int y, BufferedImage input) //function to translate image by Y pixels vertically, negative input is upwards. Used for RGB channels aligment
    {
        AffineTransform tx = new AffineTransform();
        tx.translate(0, y);

        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BICUBIC);
        input = op.filter(input, null);
        return input;
    }

    public static BufferedImage frameletsAssembly(BufferedImage[] framelets, int width, int height) {
        BufferedImage output = new BufferedImage(width, height / 14, BufferedImage.TYPE_BYTE_GRAY); //outputimage output
        Graphics G = output.getGraphics(); //graphics for output
        int currentHeight = 0;
        int i = 0;
        while (framelets[i + 1] != null) {
            G.drawImage(framelets[i], 0, (currentHeight), null);  //add framelet to Blue image at proper height
            i++;
            currentHeight += 10;
        }
        System.out.print(output);
        return output;
    }

    public static void saveChannels(String path) throws IOException {
        System.out.print(path);
        ImageIO.write(channels[0], "png", new File(path + "/Channel1.png"));

        ImageIO.write(channels[1], "png", new File(path + "/Channel2.png"));

        ImageIO.write(channels[2], "png", new File(path + "/Channel3.png"));

        ImageIO.write(channels[3], "png", new File(path + "/Channel4.png"));

        ImageIO.write(channels[4], "png", new File(path + "/Channel5.png"));
    }

}
