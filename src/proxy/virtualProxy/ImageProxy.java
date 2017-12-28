package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by xu on 01/08/2017.
 */
public class ImageProxy implements Icon {//实现Icon接口

    //虚拟代理持有RealSubject
    ImageIcon imageIcon;//希望加载后显示出来的真正图像
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    //将图像的URL传入构造器，这是我们希望显示的图像所在位置
    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    //图像加载完毕前，返回默认的宽和高
    //图像加载完毕后，交给imageIcon处理
    @Override
    public int getIconWidth() {
        return imageIcon==null?600:imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon==null?800:imageIcon.getIconHeight();
    }

    //当需要在屏幕上绘制图像时，调用此方法
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null)//如果已经有RealSubject，就委托给对象自己
            imageIcon.paintIcon(c,g,x,y);
        else {//否则就显示"正在加载"

            g.drawString("Loading CD Cover, please wait...", x+300, y+190);
            if (!retrieving) {//如果还没有取出图像
                retrieving = true;//那么就开始取出图像
                //我们不希望挂起整个用户界面，因此用另一个线程取出图像
                retrievalThread = new Thread(new Runnable() {

                    //这里加载真正的Icon
                    @Override
                    public void run() {
                        //线程中，我们实例化Icon对象，其构造器会在图像加载完成后'才返回'
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        //当图像准备好，我们告诉Swing，需要重新绘制
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }

}
