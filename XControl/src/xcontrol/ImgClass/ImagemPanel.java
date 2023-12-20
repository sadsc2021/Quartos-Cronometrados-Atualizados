/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xcontrol.ImgClass;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Samuel Araújo (XDetalfa Entertainmet)
 */
public class ImagemPanel extends javax.swing.JPanel{
    
    private ImageIcon img;
    
    public ImagemPanel(){
       img = new ImageIcon();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
    
    public void setImg(ImageIcon img){
        this.img = img;
    }
    
    public ImageIcon getImg(){
        return this.img;
    }
}